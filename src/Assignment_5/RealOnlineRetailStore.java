package Assignment_5;

import java.util.HashMap;
import java.util.Map;

public class RealOnlineRetailStore implements OnlineRetailStore{
    private Map<String,Integer> products = new HashMap<>();
    @Override
    public void purchase(String productName, int quantity) {
        if (products.containsKey(productName)) {
            int availableQuantity = products.get(productName);
            if (availableQuantity >= quantity) {
                System.out.println("Purchased " + quantity + " " + productName + " from the online store.");
                products.put(productName, availableQuantity - quantity);
            } else {
                System.out.println("Sorry, the requested quantity of " + productName + " is not available.");
            }
        } else {
            System.out.println("Sorry, " + productName + " is not available in the online store.");
        }
    }

    public void addProduct(String productName, int quantity) {
        products.put(productName, quantity);
    }
}
