package practice.state_pattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayAvailableProducts();
        vendingMachine.insertDollar();
        vendingMachine.purchaseProduct("coke");
        vendingMachine.displayAvailableProducts();
        vendingMachine.purchaseProduct("coke");
    }
}
