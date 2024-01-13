package Assignment_7;

public class HasOneDollarState implements VendingMachineState {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("You can only insert one dollar at a time.");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Money ejected. Going back to IdleState.");
        vendingMachine.setState(new IdleState());
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Item dispensed. Going back to IdleState.");
        vendingMachine.setState(new IdleState());
    }
}
