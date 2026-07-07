import java.util.HashSet;
import java.util.Objects;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Rule: Objects with the exact same data must produce the same hash code
    @Override
    public int hashCode() {
        int hash = Objects.hash(name, price);
        System.out.println("-> Generated hash for [" + name + "]: " + hash);
        return hash;
    }

    // Rule: If two hash codes collide or need verification, equals() confirms identity
    @Override
    public boolean equals(Object o) {
        System.out.println("   [equals() called to check if " + this.name + " matches the other item]");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

public class Hashing {
    public static void main(String[] args) {
        // A HashSet uses hashing to instantly check if an item already exists
        HashSet<Product> storeInventory = new HashSet<>();

        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Phone", 499.99);
        // p3 has the exact same data as p1
        Product p3 = new Product("Laptop", 999.99); 

        System.out.println("--- Adding Product 1 ---");
        storeInventory.add(p1);

        System.out.println("\n--- Adding Product 2 ---");
        storeInventory.add(p2);

        System.out.println("\n--- Adding Product 3 (Duplicate data of Product 1) ---");
        storeInventory.add(p3);

        System.out.println("\n--- Final Inventory ---");
        System.out.println(storeInventory);
    }
}
