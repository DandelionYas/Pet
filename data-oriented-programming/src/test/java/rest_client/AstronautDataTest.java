package rest_client;

import org.junit.jupiter.api.Test;
import rest_client.records.Result;
import rest_client.client.AstroDataClient;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AstronautDataTest {

    @Test
    void textCallingAstronautDataAPI() {
        Result result = AstroDataClient.fetchAndProcessData();

        switch (result) {
            case Result.Success success -> AstroDataClient.printResults(success.astronautsByCraft());
            case Result.Failure failure -> System.out.println("Error: " + failure.error());
        }

        assertInstanceOf(Result.Success.class, result);
    }
}
