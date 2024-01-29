import java.util.ArrayList;
class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public double calculateTotalBalance() {
        double totalBalance = 0;
        for (Account account : accounts) {
            totalBalance += account.GetBalance();
        }
        return totalBalance;
    }

    public void applyInterestToSavingsAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingAccounts) {
                SavingAccounts savingsAccount = (SavingAccounts) account;
                savingsAccount.CalculateInterest();
            }
            else
            {
                System.out.println("You account is not a SavingAcount");
            }
        }
    }
}