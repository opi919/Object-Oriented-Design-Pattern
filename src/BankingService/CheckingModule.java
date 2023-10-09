package BankingService;

public class CheckingModule implements BankingModule{
    private double balance =0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + "tk to Checking account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "tk  from Checking account");
        } else {
            System.out.println("Insufficient funds in Checking account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
