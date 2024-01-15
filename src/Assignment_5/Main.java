package Assignment_5;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        OnlineRetailStore onlineRetailStore = new ProxyOnlineRetailStore();

        // Check the availability of a specific product
        String productToCheck = "Laptop";
        System.out.println("Checking availability of " + productToCheck);
        displayAvailableProducts(onlineRetailStore, productToCheck);
    }

    private static void displayAvailableProducts(OnlineRetailStore onlineRetailStore, String productToCheck) {
        Map<String, Integer> availableProducts = onlineRetailStore.getAvailableProducts(productToCheck);

        if (!availableProducts.isEmpty()) {
            System.out.println("Product shipping from " + onlineRetailStore.getShippingLocation());
        }
    }
}
