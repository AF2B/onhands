import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RangesArchitecture {
    Map<String, Integer> rangesArchitecture(List<Map<String, Object>> data) {
        Map<String, Integer> ageGroups = new HashMap<>();
        ageGroups.put("2 a 6", 0);
        ageGroups.put("7 a 12", 0);
        ageGroups.put("13 a 18", 0);
        ageGroups.put("19 a 24", 0);
        ageGroups.put("25 a 30", 0);
        ageGroups.put("31 a 36", 0);
        ageGroups.put("37 a 42", 0);
        ageGroups.put("43 a 48", 0);
        ageGroups.put("49+", 0);
    
        for (Map<String, Object> item : data) {
            int age = (int) item.get("age");
            int count = (int) item.get("count");
    
            if (age >= 2 && age <= 6) {
                ageGroups.put("2 a 6", ageGroups.get("2 a 6") + count);
            } else if (age >= 7 && age <= 12) {
                ageGroups.put("7 a 12", ageGroups.get("7 a 12") + count);
            } else if (age >= 13 && age <= 18) {
                ageGroups.put("13 a 18", ageGroups.get("13 a 18") + count);
            } else if (age >= 19 && age <= 24) {
                ageGroups.put("19 a 24", ageGroups.get("19 a 24") + count);
            } else if (age >= 25 && age <= 30) {
                ageGroups.put("25 a 30", ageGroups.get("25 a 30") + count);
            } else if (age >= 31 && age <= 36) {
                ageGroups.put("31 a 36", ageGroups.get("31 a 36") + count);
            } else if (age >= 37 && age <= 42) {
                ageGroups.put("37 a 42", ageGroups.get("37 a 42") + count);
            } else if (age >= 43 && age <= 48) {
                ageGroups.put("43 a 48", ageGroups.get("43 a 48") + count);
            } else if (age >= 49) {
                ageGroups.put("49+", ageGroups.get("49+") + count);
            }
        }
    
        return ageGroups;
    }
}