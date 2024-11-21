package restclient;

import org.junit.jupiter.api.Test;
import restclient.records.Result;
import restclient.client.AstroDataClient;

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
