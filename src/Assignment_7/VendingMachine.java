package Assignment_7;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private VendingMachineState state;
    private Map<String, Product> products;

    public VendingMachine() {
        this.state = new Assignment_7.IdleState();
        this.products = new HashMap<>(0);

        initializeProducts();
    }

    private void initializeProducts() {
        products.put("coke", new Product("coke", 1.5, 5));
        products.put("chips", new Product("chips", 1.5, 5));
        products.put("pepsi", new Product("pepsi", 1.5, 5));
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertDollar() {
        state.insertDollar(this);
    }

    public void ejectMoney() {
        state.ejectMoney(this);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void purchaseProduct(String productName) {
        Product product = products.get(productName);

        if (product != null && product.getQuantity() > 0) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
            product.decreaseQuantity();
            dispenseItem();
        } else {
            System.out.println("Selected product is not available.");
        }
    }

    public void displayAvailableProducts() {
        System.out.println("Available Products:");
        for (Product product : products.values()) {
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity() +
                    ", Price: $" + product.getPrice());
        }
    }
}
