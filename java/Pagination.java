import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pagination {
    private Map<String, String> params;

    public Pagination() {
        this.params = new HashMap<>();
    }

    public void setLimit(String limit) {
        params.put("limit", limit);
    }

    public void setPage(String page) {
        params.put("page", page);
    }

    public int getLimit() {
        return limitParams();
    }

    public int getOffset() {
        return offset();
    }

    public int getPage() {
        return pageParams();
    }

    private int limitParams() {
        String limitStr = params.getOrDefault("limit", "10");
        int limit = Integer.parseInt(limitStr);
        List<String> validLimits = Arrays.asList("25", "50");
        if (!validLimits.contains(limitStr)) {
            limit = 10;
        }
        return limit;
    }

    private int offset() {
        return (pageParams() - 1) * limitParams();
    }

    private int pageParams() {
        String pageStr = params.getOrDefault("page", "1");
        return Integer.parseInt(pageStr);
    }
}