package StatePattern;

public class VendingMachineDemo {
    public static void main(String[] args) {
        // Create a vending machine with 5 products
        VendingMachine vendingMachine = new VendingMachine(5);

        // Insert a dollar and dispense a product
        vendingMachine.insertDollar();
        vendingMachine.dispense();

        // Try inserting a dollar when one is already inserted
        vendingMachine.insertDollar();

        // Eject money
        vendingMachine.ejectMoney();

        // Dispense a product when there are more left
        vendingMachine.insertDollar();
        vendingMachine.dispense();

        // Dispense the last product
        vendingMachine.insertDollar();
        vendingMachine.dispense();

        // Try to dispense a product when out of stock
        vendingMachine.dispense();
    }
}
