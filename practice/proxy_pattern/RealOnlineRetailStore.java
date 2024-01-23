package practice.proxy_pattern;

import java.util.HashMap;
import java.util.Map;

public class RealOnlineRetailStore implements OnlineRetailStore {
    private Map<String, Map<String, Integer>> warehouses;

    public RealOnlineRetailStore() {
        this.warehouses = new HashMap<>();
        initializeWarehouses();
    }

    private void initializeWarehouses() {
        Map<String, Integer> warehouse1 = new HashMap<>(0);
        warehouse1.put("laptop", 100);
        warehouse1.put("mobile", 50);

        Map<String, Integer> warehouse2 = new HashMap<>(0);
        warehouse2.put("keyboard", 100);
        warehouse2.put("mouse", 50);

        warehouses.put("dhaka", warehouse1);
        warehouses.put("rajshahi", warehouse2);
    }

    @Override
    public void displayProducts() {
        System.out.println("Available products:");
        for (Map.Entry<String, Map<String, Integer>> entry : warehouses.entrySet()) {
            System.out.println("Warehouse: " + entry.getKey());
            for (Map.Entry<String, Integer> product : entry.getValue().entrySet()) {
                System.out.println("Product: " + product.getKey() + ", Quantity: " + product.getValue());
            }
        }
    }

    @Override
    public void purchaseProduct(String productName, int quantity) {
        boolean productFound = false;

        for (Map.Entry<String, Map<String, Integer>> entry : warehouses.entrySet()) {
            Map<String, Integer> warehouse = entry.getValue();
            if (warehouse.containsKey(productName) && warehouse.get(productName) >= quantity) {
                System.out.println("Processing order for " + quantity + " units of " + productName +
                        " from Warehouse " + entry.getKey());
                warehouse.put(productName, warehouse.get(productName) - quantity);
                System.out.println("Order placed successfully!");
                productFound = true;
                break;
            }
        }

        if (!productFound) {
            System.out.println("Sorry, the product " + productName + " is out of stock.");
        }
    }

}
