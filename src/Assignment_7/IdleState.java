package Assignment_7;

public class IdleState implements VendingMachineState {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Dollar inserted. Moving to HasOneDollarState.");
        vendingMachine.setState(new Assignment_7.HasOneDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to eject.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please insert a dollar first.");
    }
}
