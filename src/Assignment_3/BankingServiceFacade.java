package Assignment_3;

public class BankingServiceFacade {
    private BankingModule checkingModule;
    private BankingModule savingModule;
    private BankingModule investmentModule;

    public BankingServiceFacade(double initialCheckingBalance, double initialSavingBalance,
            double initialInvestmentBalance) {
        this.checkingModule = new CheckingModule(initialCheckingBalance);
        this.savingModule = new SavingModule(initialSavingBalance);
        this.investmentModule = new InvestmentModule(initialInvestmentBalance);
    }

    public void checkAccountBalances() {
        checkingModule.checkBalance();
        savingModule.checkBalance();
        investmentModule.checkBalance();
    }

    public void processTransaction(double amount, String transactionType, String asset) {
        if (transactionType.equalsIgnoreCase("Check")) {
            ((CheckingModule) checkingModule).processCheck(asset, amount);
        } else if (transactionType.equalsIgnoreCase("Transfer")) {
            ((SavingModule) savingModule).transferToChecking(amount, (CheckingModule) checkingModule);
        } else if (transactionType.equalsIgnoreCase("Invest")) {
            ((InvestmentModule) investmentModule).invest(amount, asset);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }
}
