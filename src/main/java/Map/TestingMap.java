package Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("kuhu", 100);
        map.put("paro", 120);
        map.put("naj", 80);

        System.out.println("Size: " + map.size());
        System.out.println("naj's marks: " + map.get("naj"));
        System.out.println("Contains key 'paro'? " + map.containsKey("paro"));
        System.out.println("Removed value: " + map.remove("paro"));

        System.out.println("\nAfter removal:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        String country = "India";
        user(country);
    }

    public static void user(String country) {
        try{
        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "Delhi");
        capitals.put("WB", "Kolkata");
        capitals.put("USA", "Washington DC");
        Map<String, String> cap=Map.of("India", "Delhi",
                "WB", "Kolkata",
                "USA", "Washington DC");

        if (capitals.containsKey(country)) {
            System.out.println("Capital of " + country + ": " + capitals.get(country));
        } else {
            System.out.println("Country not found in the map.");
        }}
        catch(Exception e){
                System.out.println("unexpected:" + e.getMessage());
            }

    }
}
