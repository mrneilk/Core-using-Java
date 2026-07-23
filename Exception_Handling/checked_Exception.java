
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public void printFirstLine(String path) {
        // Try-with-resources automatically closes 'reader' when done
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            // Handle the checked exception gracefully
            System.err.println("Could not read file: " + e.getMessage());
        }
    }
}
