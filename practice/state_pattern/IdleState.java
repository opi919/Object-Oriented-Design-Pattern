package practice.state_pattern;

public class IdleState implements VendingMachineState {

    @Override
    public void insetDollar(VendingMachine vendingMachine) {
        vendingMachine.setState(new HasOneDollarState());
        System.out.println("Dollar inserted. Moving to HasOneDollarState.");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to eject");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Insert a Dollar first");
    }

}
