package Assignment_3;

public class CheckingModule implements BankingModule {
    private double checkingBalance;

    public CheckingModule(double initialBalance) {
        this.checkingBalance = initialBalance;
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking Module: Balance: $" + checkingBalance);
    }

    public void processCheck(String recipient, double amount) {
        if (checkingBalance >= amount) {
            checkingBalance -= amount;
            System.out.println("Checking Module: Processed check to " + recipient + " for $" + amount);
        } else {
            System.out.println("Checking Module: Insufficient funds for check processing.");
        }
    }

    @Override
    public double getBalance() {
        return checkingBalance;
    }
}
