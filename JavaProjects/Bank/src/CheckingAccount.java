public class CheckingAccount extends Account{
    double limit;
    public CheckingAccount(double accountID, double balance, double limit) {
        super(accountID, balance);
        this.limit = limit;
    }

    @Override
    public double Withdrawal(double value)
    {
        if(balance - value >= -limit)
        {
            balance -= value;
        }
        else
        {
            System.out.println("You can not take that much debt you exceed the limit");
        }
        System.out.println("Your new balance is " + this.balance);
        return balance;
    }
}
