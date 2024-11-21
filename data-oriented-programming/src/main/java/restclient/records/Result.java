package restclient.records;

import java.util.List;
import java.util.Map;

public sealed interface Result {
    record Success(Map<String, List<String>> astronautsByCraft) implements Result {}
    record Failure(String error) implements Result {}
}
