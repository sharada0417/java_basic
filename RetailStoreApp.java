import java.util.ArrayList;
import java.util.List;

// Base class for products
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to display product details (Polymorphism)
    public void displayProductDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Subclass for Fruits
class Fruit extends Product {
    public Fruit(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}

// Subclass for Vegetables
class Vegetable extends Product {
    public Vegetable(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}

// Subclass for Grocery
class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}

// RetailStore class to manage products
class RetailStore {
    private List<Product> products;

    // Constructor to initialize the list
    public RetailStore() {
        products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to edit a product
    public void editProduct(String name, double newPrice, int newQuantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                System.out.println(name + " has been updated.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Method to delete a product
    public void deleteProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                System.out.println(name + " has been deleted.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Method to display all available products
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Available Products:");
            for (Product product : products) {
                product.displayProductDetails();
                System.out.println("------------------------");
            }
        }
    }
}

// Main class to test the implementation
public class RetailStoreApp {
    public static void main(String[] args) {
        // Creating a retail store object
        RetailStore store = new RetailStore();

        // Adding products to the store
        store.addProduct(new Fruit("Apple", 1.2, 50));
        store.addProduct(new Vegetable("Carrot", 0.8, 100));
        store.addProduct(new Grocery("Rice", 2.5, 200));

        // Displaying available products
        store.displayAllProducts();

        // Editing a product
        store.editProduct("Apple", 1.5, 60);

        // Displaying products after editing
        System.out.println("\nAfter Editing Apple Product:");
        store.displayAllProducts();

        // Deleting a product
        store.deleteProduct("Carrot");

        // Displaying products after deletion
        System.out.println("\nAfter Deleting Carrot Product:");
        store.displayAllProducts();
    }
}
