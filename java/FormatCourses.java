import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class FormatCourse {
    public static Map<String, Object> formatCourse(Map<String, Object> course) {
        return Map.of(
                "client", course.get("client"),
                "id", course.get("course_id"),
                "course", Map.of("name", course.get("course_name")),
                "environment", Map.of("name", course.get("environment_name")),
                "enrolled", course.get("enrolled"),
                "accessed", course.get("accessed"),
                "notAccessed", course.get("notAccessed"),
                "percentAccessed", course.get("percentAccessed"),
                "percentNotAccessed", course.get("percentNotAccessed")
        );
    }
    
    public static Map<String, Object> formatCourses(List<Map<String, Object>> courses, Map<String, Integer> pageParams) {
        List<Map<String, Object>> formattedCourses = courses.stream()
                .map(FormatCourse::formatCourse)
                .collect(Collectors.toList());
    
        return Map.of(
                "courses", formattedCourses,
                "itemCount", formattedCourses.size(),
                "totalCount", formattedCourses.size(),
                "pageParams", pageParams
        );
    }
}