package Assignment_7;

interface VendingMachineState {
    void insertDollar(VendingMachine vendingMachine);

    void ejectMoney(VendingMachine vendingMachine);

    void dispenseItem(VendingMachine vendingMachine);
}
