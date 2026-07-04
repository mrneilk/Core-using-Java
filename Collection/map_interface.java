import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map_interface {
    public static void main(String[] args) {
        
        // 1. HashMap: Elements are unordered (stored by hash code)
        Map<String, Double> hashMap = new HashMap<>();
        populateMap(hashMap);
        System.out.println("--- HashMap (No guaranteed order) ---");
        displayMap(hashMap);

        // 2. LinkedHashMap: Elements maintain insertion order
        Map<String, Double> linkedHashMap = new LinkedHashMap<>();
        populateMap(linkedHashMap);
        System.out.println("\n--- LinkedHashMap (Insertion order) ---");
        displayMap(linkedHashMap);

        // 3. TreeMap: Keys are automatically sorted (Alphabetical for Strings)
        Map<String, Double> treeMap = new TreeMap<>();
        populateMap(treeMap);
        System.out.println("\n--- TreeMap (Sorted key order) ---");
        displayMap(treeMap);
        
        // 4. Demonstrating common Map operations using the HashMap
        System.out.println("\n--- Common Map Operations ---");
        
        // Fetching a value using a key -> O(1)
        String searchKey = "Laptop";
        if (hashMap.containsKey(searchKey)) {
            System.out.println("Price of " + searchKey + ": $" + hashMap.get(searchKey));
        }
        
        // Removing an item
        hashMap.remove("Headphones");
        System.out.println("After removing Headphones, size is: " + hashMap.size());
    }

    // Helper method to add the same items to each map
    private static void populateMap(Map<String, Double> map) {
        map.put("Laptop", 999.99);
        map.put("Smartphone", 699.99);
        map.put("Headphones", 149.99);
        map.put("Tablet", 399.99);
    }

    // Helper method to iterate and display the map contents
    private static void displayMap(Map<String, Double> map) {
        // Using map.entrySet() to efficiently iterate over keys and values together
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => $" + entry.getValue());
        }
    }
}
