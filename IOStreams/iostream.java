import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class iostream {
    public static void main(String[] args) {
        // Try-with-resources automatically closes the reader
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {    // The file location implementation needs a check
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
