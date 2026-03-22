import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductFilter {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        // Sample data
        products.add(new Product("Laptop", 55000));
        products.add(new Product("Mouse", 500));
        products.add(new Product("Phone", 25000));
        products.add(new Product("Keyboard", 1500));
        products.add(new Product("Headphones", 3000));

        double threshold = 2000;

        System.out.println("Expensive Products (Price > " + threshold + "):");

        // Filter logic
        for (Product p : products) {
            if (p.price > threshold) {
                System.out.println(p.name + " - " + p.price);
            }
        }
    }
}