package BankingService;

public class BankingFacade {
    private BankingModule chekingModule = new CheckingModule();
    private BankingModule savingModule = new SavingModule();
    private BankingModule investModule = new InvestModule();

    //saving module
    public void  depositToSaving(double amount){
        savingModule.deposit(amount);
    }

    public void  withdrawFromSaving(double amount){
        savingModule.withdraw(amount);
    }

    public double getSavingBalance(){
       return savingModule.getBalance();
    }

    //invest module
    public void  depositToInvest(double amount){
        investModule.deposit(amount);
    }

    public void  withdrawFromCheking(double amount){
        chekingModule.withdraw(amount);
    }

    public double getChekingBalance(){
        return chekingModule.getBalance();
    }

    //cheking module
    public void  depositToCheking(double amount){
        chekingModule.deposit(amount);
    }

    public void  withdrawFromInvest(double amount){
        investModule.withdraw(amount);
    }

    public double getInvestBalance(){
        return investModule.getBalance();
    }
}
