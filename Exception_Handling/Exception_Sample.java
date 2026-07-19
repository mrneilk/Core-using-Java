
public class ExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // 1. Code that might cause an error goes here
            System.out.println("Accessing element at index 5...");
            int riskyElement = numbers[5]; 
            System.out.println("This line will not run if an error happens above.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // 2. Code to handle the specific error goes here
            System.out.println("Error caught: You tried to access an index outside the array bounds!");
            System.out.println("System message: " + e.getMessage());
            
        } finally {
            // 3. This block ALWAYS runs, no matter what
            System.out.println("The 'finally' block is executed. Cleaning up resources...");
        }

        System.out.println("The program safely continues running!");
    }
}
