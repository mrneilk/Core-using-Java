import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // 1. Declaration and Initialization (Coding to the interface)
        List<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Apple"); // Duplicates are fine

        // 3. Accessing elements by index
        String secondFruit = fruits.get(1); 
        System.out.println("Fruit at index 1: " + secondFruit); // Output: Banana

        // 4. Updating an element
        fruits.set(2, "Mango"); // Replaces Orange with Mango

        // 5. Iterating through the list
        System.out.println("Current Fruit List:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
