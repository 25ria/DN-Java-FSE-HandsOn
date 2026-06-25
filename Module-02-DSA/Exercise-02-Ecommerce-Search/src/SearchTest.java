import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")

        };

        Product result1 = SearchAlgorithms.linearSearch(products, "Phone");

        if (result1 != null)
            System.out.println("Linear Search Found : " + result1.productName);

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        Product result2 = SearchAlgorithms.binarySearch(products, "Phone");

        if (result2 != null)
            System.out.println("Binary Search Found : " + result2.productName);
    }
}