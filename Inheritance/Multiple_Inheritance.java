
// File: MultipleInheritanceDemo.java

// First interface declaring an abstract method and a default method
interface Readable {
    void readData(); // Abstract method

    default void logStatus() {
        System.out.println("[Readable] Status: Reading data stream.");
    }
}

// Second interface declaring an abstract method and a conflicting default method
interface Writable {
    void writeData(); // Abstract method

    default void logStatus() {
        System.out.println("[Writable] Status: Writing data stream.");
    }
}

// Concrete class implementing multiple interfaces
class DataProcessor implements Readable, Writable {

    // Implementation of Readable abstract method
    @Override
    public void readData() {
        System.out.println("Processing input: Reading data from source...");
    }

    // Implementation of Writable abstract method
    @Override
    public void writeData() {
        System.out.println("Processing output: Writing data to storage...");
    }

    // Explicit resolution of default method collision
    @Override
    public void logStatus() {
        System.out.println("--- Resolving Interface Conflict ---");
        
        // Invoking Readable's default implementation using InterfaceName.super
        Readable.super.logStatus();
        
        // Invoking Writable's default implementation using InterfaceName.super
        Writable.super.logStatus();
        
        System.out.println("[DataProcessor] Custom log: Data processing active.");
    }
}

// Main class to run the program
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();

        // Calling abstract interface implementations
        processor.readData();
        processor.writeData();

        System.out.println();

        // Calling the resolved logStatus method
        processor.logStatus();

        System.out.println();

        // Polymorphic reference demonstration
        Readable readerRef = processor;
        readerRef.readData(); // Dynamic dispatch executes DataProcessor's readData

        Writable writerRef = processor;
        writerRef.writeData(); // Dynamic dispatch executes DataProcessor's writeData
    }
}
