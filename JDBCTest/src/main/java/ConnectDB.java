import java.util.List;
import java.util.Map;

public interface ConnectDB {

    Map<Integer, List<String>> simpleQuery(String... args);
}
