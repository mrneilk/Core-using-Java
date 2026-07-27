// To be run and tested
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Triggers ArithmeticException
            System.out.println("Result: " + result); // Skipping: won't execute
        } catch (ArithmeticException e) {
            System.out.println("Handled error: Cannot divide by zero.");
            System.out.println("Details: " + e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}
