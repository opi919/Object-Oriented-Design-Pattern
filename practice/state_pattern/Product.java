package practice.state_pattern;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String getName() {
        return name;
    }

    Double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    void decreaseQuantity() {
        if (quantity > 0)
            quantity--;
    }

}
