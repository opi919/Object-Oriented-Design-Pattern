package BankingService;

public interface BankingModule {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
