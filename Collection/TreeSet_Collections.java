import java.util.TreeSet;

public class TreeSet_Collections {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Cherry");
        ts.add("Apple"); // Duplicate, will be ignored
        
        // Output will be automatically sorted alphabetically: [Apple, Banana, Cherry]
        System.out.println(ts); 
    }
}
