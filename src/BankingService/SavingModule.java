package BankingService;

public class SavingModule implements  BankingModule{
    private double balance = 0;
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + "tk to Saving account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "tk from Saving account");
        } else {
            System.out.println("Insufficient funds in Saving account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
