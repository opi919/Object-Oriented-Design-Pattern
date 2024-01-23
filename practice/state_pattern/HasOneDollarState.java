package practice.state_pattern;

public class HasOneDollarState implements VendingMachineState {

    @Override
    public void insetDollar(VendingMachine vendingMachine) {
        System.out.println("dollar already inserted. buy product");
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
