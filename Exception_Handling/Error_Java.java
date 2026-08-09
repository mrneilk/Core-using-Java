// How to catch and throw??
//int x = "Hello"; // Error: Type mismatch (Cannot convert String to int)

import java.util.InputMismatchException;
import java.util.Scanner;

public class Error_Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // May throw ArithmeticException if denominator is 0
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.err.println("Error: Cannot divide by zero!");

        } catch (InputMismatchException e) {
            // Handles non-integer input (e.g., entering letters)
            System.err.println("Error: Please enter valid integer numbers only!");

        } catch (Exception e) {
            // Generic catch block to handle any other unexpected exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // Always executes regardless of whether an exception occurred or not
            System.out.println("Execution finished. Closing resources...");
            scanner.close();
        }
    }
}
