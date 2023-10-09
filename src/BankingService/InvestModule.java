package BankingService;

public class InvestModule implements  BankingModule{
    private double balance = 0;
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Invested " + amount+"tk");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "tk from investment");
        } else {
            System.out.println("Insufficient funds in investment");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
