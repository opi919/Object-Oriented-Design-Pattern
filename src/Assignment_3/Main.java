package Assignment_3;

public class Main {
    public static void main(String[] args) {
        BankingServiceFacade bankingServiceFacade = new BankingServiceFacade(550, 500, 100);
        // Check account balances
        bankingServiceFacade.checkAccountBalances();

        // Process transactions
        System.out.println("Processing Transactions:");
        bankingServiceFacade.processTransaction(1000, "Check", "Recipient A");
        bankingServiceFacade.processTransaction(500, "Transfer", "");
        bankingServiceFacade.processTransaction(2000, "Invest", "Stock XYZ");
    }

}
