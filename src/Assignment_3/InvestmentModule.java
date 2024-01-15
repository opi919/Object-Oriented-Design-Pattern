package Assignment_3;

public class InvestmentModule implements BankingModule {
    private double investmentBalance;

    public InvestmentModule(double initialBalance) {
        this.investmentBalance = initialBalance;
    }

    @Override
    public void checkBalance() {
        System.out.println("Investment Module: Checking investment portfolio. Balance: $" + investmentBalance);
    }

    public void invest(double amount, String asset) {
        if (investmentBalance >= amount) {
            investmentBalance -= amount;
            System.out.println("Investment Module: Invested $" + amount + " in " + asset);
        } else {
            System.out.println("Investment Module: Insufficient funds for investment.");
        }
    }

    @Override
    public double getBalance() {
        return investmentBalance;
    }
}
