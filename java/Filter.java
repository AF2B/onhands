import java.util.Map;

public class Filter {
    private Map<String, String> params;

    public Filter(Map<String, String> params) {
        this.params = params;
    }

    public String filter(String id) {
        if (params != null && params.containsKey(id)) {
            return params.get(id);
        } else {
            return null;
        }
    }

    public String userFilter() {
        return filter("user");
    }

    public String platformFilter() {
        return filter("platform");
    }

    public String environmentFilter() {
        return filter("environment");
    }

    public String courseFilter() {
        return filter("course");
    }

    public String spaceFilter() {
        return filter("space");
    }

    public String subjectFilter() {
        return filter("subject");
    }

    public String studentFilter() {
        return filter("student");
    }

    public String lectureFilter() {
        return filter("lecture");
    }

    public Map<String, String> dataFilter() {
        if (params != null && params.containsKey("start") && params.containsKey("end")) {
            String startDate = params.get("start");
            String endDate = params.get("end");
            
            return Map.of("start_date", startDate, "end_date", endDate);
        } else {
            return null;
        }
    }
}