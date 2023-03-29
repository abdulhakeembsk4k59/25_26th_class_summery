import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FltPrdtsCntnsWordTea {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tea", 100, 120));
        products.add(new Product("Coffee", 100, 110));
        products.add(new Product("Green Tea", 75, 100));

        // Filter products that contain the word "Tea"
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getName().contains("Tea"))
                .collect(Collectors.toList());

        // Calculate total sales for each year
        int totalSales21 = filteredProducts.stream()
                .mapToInt(Product::getSales21)
                .sum();
        int totalSales22 = filteredProducts.stream()
                .mapToInt(Product::getSales22)
                .sum();

        // Print the results
        System.out.println("Filtered Products: " + filteredProducts);
        System.out.println("Total Sales 2021: " + totalSales21);
        System.out.println("Total Sales 2022: " + totalSales22);
    }
}

class Product {
    private String name;
    private int sales21;
    private int sales22;

    public Product(String name, int sales21, int sales22) {
        this.name = name;
        this.sales21 = sales21;
        this.sales22 = sales22;
    }

    public String getName() {
        return name;
    }

    public int getSales21() {
        return sales21;
    }

    public int getSales22() {
        return sales22;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sales21=" + sales21 +
                ", sales22=" + sales22 +
                '}';
    }
}
