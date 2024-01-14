package Assignment_5;

import java.util.HashMap;
import java.util.Map;

public class RealOnlineRetailStore implements OnlineRetailStore {
    private Map<String, Map<String, Integer>> warehouses;
    private String shippingLocation;

    public RealOnlineRetailStore() {
        warehouses = new HashMap<>();
        initializeWarehouses();
    }

    private void initializeWarehouses() {
        Map<String, Integer> warehouse1 = new HashMap<>();
        warehouse1.put("Laptop", 100);
        warehouse1.put("Smartphone", 200);

        Map<String, Integer> warehouse2 = new HashMap<>();
        warehouse2.put("Headphones", 150);
        warehouse2.put("Tablet", 50);

        warehouses.put("Dhaka", warehouse1);
        warehouses.put("Rajshahi", warehouse2);
    }

    @Override
    public Map<String, Integer> getAvailableProducts(String product) {
        Map<String, Integer> availableProducts = warehouses.getOrDefault(shippingLocation, new HashMap<>());

        // Check if the product is available in any warehouse
        for (Map.Entry<String, Map<String, Integer>> entry : warehouses.entrySet()) {
            if (!entry.getKey().equals(shippingLocation)) {
                availableProducts = entry.getValue();
                if (availableProducts.containsKey(product)) {
                    // Product found
                    System.out.println("Product found in " + entry.getKey() + " warehouse.");
                    shippingLocation = entry.getKey();
                    return availableProducts;
                }
            }
        }

        // Product not available in any warehouse
        System.out.println("Product not available in any warehouse.");
        return new HashMap<>();
    }

    @Override
    public String getShippingLocation() {
        return shippingLocation;
    }
}
