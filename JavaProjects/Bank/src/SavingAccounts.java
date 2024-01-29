public class SavingAccounts extends Account{
    double interestRate;
    public SavingAccounts(double accountID, double balance, double interestRate) {
        super(accountID, balance);
        this.interestRate = interestRate;
    }

    public void CalculateInterest()
    {
        double interest = GetBalance() * (interestRate / 100);
        balance += interest;
        System.out.println("Your new balance is " + this.balance);
    }
}
