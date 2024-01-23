package practice.state_pattern;

public class OutOfStockState implements VendingMachineState {
    @Override
    public void insetDollar(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Cannot accept money.");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to eject.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Cannot dispense item.");
    }
}
