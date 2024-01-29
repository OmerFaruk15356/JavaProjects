public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        SavingAccounts savingsAccount = new SavingAccounts(1, 1000.0, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(2, 1500.0, 500.0);

        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);

        savingsAccount.Deposit(500.0);
        checkingAccount.Withdrawal(200.0);

        bank.applyInterestToSavingsAccounts();

        double totalBalance = bank.calculateTotalBalance();
        System.out.println("Your total balance is " + totalBalance);

    }

}


