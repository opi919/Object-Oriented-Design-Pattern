package Assignment_7;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.displayAvailableProducts();
        vendingMachine.insertDollar();
        vendingMachine.purchaseProduct("coke");
    }
}
