package practice.state_pattern;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private VendingMachineState state;
    private Map<String, Product> products;

    public VendingMachine() {
        this.state = new IdleState();
        this.products = new HashMap<>(0);
        initializeProducts();
    }

    void initializeProducts() {
        products.put("coke", new Product("coke", 10, 5));
        products.put("chips", new Product("chips", 5, 5));
        products.put("pepsi", new Product("pepsi", 5, 5));
    }

    void setState(VendingMachineState state) {
        this.state = state;
    }

    void insertDollar() {
        state.insetDollar(this);
    }

    void ejectMoney() {
        state.ejectMoney(this);
    }

    void dispenseItem() {
        state.dispenseItem(this);
    }

    public void purchaseProduct(String name) {
        Product product = products.get(name);
        if (product != null) {
            if (state instanceof HasOneDollarState) {
                if (product.getQuantity() > 0) {
                    System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
                    product.decreaseQuantity();
                    dispenseItem();
                } else {
                    System.out.println("Selected product is out of stock.");
                    setState(new OutOfStockState());
                }
            } else {
                dispenseItem();
            }
        } else {
            System.out.println("Selected product is not available.");
        }
    }

    void displayAvailableProducts() {
        System.out.println("available products:");
        for (Product product : products.values()) {
            System.out.println("Name: " + product.getName() + " price: " + product.getPrice() + " quantity: "
                    + product.getQuantity());
        }
    }
}
