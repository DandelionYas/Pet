package restclient.records;

import java.util.List;

public record AstroResponse(List<Astronaut> people, int number, String message) {
}
