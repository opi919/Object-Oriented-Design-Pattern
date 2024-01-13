package Assignment_7;

public class Product {
    private String name;
    private Double price;
    private int quantity;

    public Product(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void decreaseQuantity(){
        if(quantity>0) quantity--;
    }
}
