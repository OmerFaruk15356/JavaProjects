public class Account {
    private double accountID;
    protected double balance;

    public Account(double accountID,double balance)
    {
        SetAccountID(accountID);
        SetBalance(balance);
    }

    public void SetAccountID(double accountID)
    {
        this.accountID = accountID;
    }

    public void SetBalance(double balance)
    {
        this.balance = balance;
    }

    public double GetAccountID()
    {
        return this.accountID;
    }

    public double GetBalance()
    {
        return this.balance;
    }

    public double Deposit(double value)
    {
        this.balance += value;
        System.out.println("Your new balance is " + this.balance);
        return this.balance;
    }

    public double Withdrawal(double value)
    {
        if(this.balance - value >= 0)
        {
            this.balance -= value;
        }
        else
        {
            System.out.println("You can not withdraw that much maybe you should get less money or you can get debt");
        }
        System.out.println("Your new balance is " + this.balance);
        return this.balance;
    }
}
