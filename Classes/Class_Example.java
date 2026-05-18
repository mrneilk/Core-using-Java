// 1. Define the Class
class Car {
    // Attributes (Variables / Fields)
    String brand;
    String model;
    int year;

    // Constructor (Used to initialize new Car objects)
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method (Behavior / Function)
    public void displayDetails() {
        System.out.println("Car: " + year + " " + brand + " " + model);
    }

    // Another Method
    public void startEngine() {
        System.out.println("The " + model + "'s engine is now running. Vroom!");
    }
}

// 2. Main Class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating objects (instances) of the Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Tesla", "Model 3", 2024);

        // Accessing methods on the objects
        car1.displayDetails();
        car1.startEngine();

        System.out.println(); // Just a blank line

        car2.displayDetails();
        car2.startEngine();
    }
}
