package Assignment_3;

public class SavingModule implements BankingModule {
    private double savingBalance;

    public SavingModule(double initialBalance) {
        this.savingBalance = initialBalance;
    }

    @Override
    public void checkBalance() {
        System.out.println("Saving Module: Balance: $" + savingBalance);
    }

    public void transferToChecking(double amount, CheckingModule checkingModule) {
        if (savingBalance >= amount) {
            savingBalance -= amount;
            checkingModule.processCheck("Transfer from Saving", amount);
        } else {
            System.out.println("Saving Module: Insufficient funds for transfer.");
        }
    }

    @Override
    public double getBalance() {
        return savingBalance;
    }
}
