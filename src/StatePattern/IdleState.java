package StatePattern;

public class IdleState implements State{
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Dollar inserted");
        vendingMachine.setState(vendingMachine.getHasOneDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to eject.");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Payment required. Please insert a dollar.");
    }
}
