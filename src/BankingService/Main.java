package BankingService;

public class Main {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();

        bankingFacade.depositToCheking(1000);
        bankingFacade.depositToSaving(2000);
        bankingFacade.depositToInvest(500);
        bankingFacade.withdrawFromCheking(200);
        bankingFacade.withdrawFromSaving(300);
        bankingFacade.withdrawFromInvest(100);

        System.out.println("Checking account balance: " + bankingFacade.getChekingBalance());
        System.out.println("Saving account balance: " + bankingFacade.getSavingBalance());
        System.out.println("Investment balance: " + bankingFacade.getInvestBalance());
    }
}
