package rest_client.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import rest_client.records.AstroResponse;
import rest_client.records.Astronaut;
import rest_client.records.Result;

import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** This service is responsible for calling a public RESTFul api by leveraging Java11's HttpClient and Data Oriented Programming
 * The API provides the list of Astronauts who are currently in space
 * Refer to People In Space Open Notify API: http://open-notify.org/Open-Notify-API/People-In-Space **/
public class AstroDataClient {
    private static final String API_URL = "http://api.open-notify.org/astros.json";
    private static final String PROXY_IP = "127.0.0.1";
    private static final Integer PROXY_PORT = 10809;
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Result fetchAndProcessData() {
        try (var client = HttpClient.newBuilder()
                .proxy(ProxySelector.of(new InetSocketAddress(PROXY_IP, PROXY_PORT)))
                .connectTimeout(Duration.ofSeconds(30))
                .build())  {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                return new Result.Failure("HTTP error: " + response.statusCode());
            }

            AstroResponse astroResponse = objectMapper.readValue(response.body(), AstroResponse.class);
            Map<String, List<String>> astronautsByCraft = groupAstronautsByCraft(astroResponse);

            return new Result.Success(astronautsByCraft);
        } catch (Exception e) {
            return new Result.Failure("Error processing Data: " + e.getMessage());
        }
    }

    private static Map<String, List<String>> groupAstronautsByCraft(AstroResponse astroResponse) {
        return astroResponse.people().stream()
                .collect(Collectors.groupingBy(Astronaut::craft, Collectors.mapping(Astronaut::name, Collectors.toList())));
    }

    public static void printResults(Map<String, List<String>> astronautsByCraft) {
        System.out.println("Astronauts currently in space:");
        astronautsByCraft.forEach((craft, astronauts) -> {
            System.out.println(craft + ":");
            astronauts.forEach(name -> System.out.println(" -" + name));
        });
    }
}
