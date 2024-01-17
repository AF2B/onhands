import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class DataCounter {
    public static Map<String, Object> jsonFormatCounters(List<Map<String, Object>> data, int page) {
        Map<String, Object> result = new HashMap<>();

        if (data == null || data.isEmpty()) {
            result.put("data", data);
            result.put("totalCount", 0);
            result.put("itemCount", 0);
            result.put("page", page);
            return result;
        }

        int itemCount = data.size();
        int totalCount = data.stream()
                             .mapToInt(object -> Integer.parseInt(object.get("count").toString()))
                             .sum();

        result.put("data", data);
        result.put("totalCount", totalCount);
        result.put("itemCount", itemCount);
        result.put("page", page);

        return result;
    }
}
