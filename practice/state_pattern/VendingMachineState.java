package practice.state_pattern;

interface VendingMachineState {
    void insetDollar(VendingMachine vendingMachine);

    void ejectMoney(VendingMachine vendingMachine);

    void dispenseItem(VendingMachine vendingMachine);
}
