import java.util.HashSet;
import java.util.Set;

class Sale {
    private String productName;
    private double price;

    public Sale(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sale)) {
            return false;
        }
        Sale sale = (Sale) obj;
        return productName.equals(sale.getProductName());
    }


    @Override
    public int hashCode() {
        return productName.hashCode();
    }

    public String toString(){
        return "["+this.productName+", "+this.price+"]";
    }
}

public class Program6 {
    public static void main(String[] args) {
        Set<Sale> sales = new HashSet<>();
        sales.add(new Sale("Tea", 1.99));
        sales.add(new Sale("Coffee", 2.99));
        sales.add(new Sale("Milk", 0.99));

        System.out.println("Before removal: " + sales);

        sales.remove(new Sale("Tea", 1.99));

        System.out.println("After removal: " + sales);
    }
}
