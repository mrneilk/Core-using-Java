import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // 1. Initialization
        Set<String> programmingLanguages = new HashSet<>();

        // 2. Adding elements
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        
        // Attempting to add a duplicate
        boolean isAdded = programmingLanguages.add("Java"); 
        System.out.println("Was second 'Java' added? " + isAdded); // Output: false

        // 3. Checking size and containment
        System.out.println("Size of set: " + programmingLanguages.size()); // Output: 3
        System.out.println("Contains 'Python'? " + programmingLanguages.contains("Python")); // Output: true

        // 4. Removing an element
        programmingLanguages.remove("JavaScript");

        // 5. Iterating over the Set
        System.out.println("Remaining elements:");
        for (String lang : programmingLanguages) {
            System.out.println("- " + lang);
        }
    }
}
