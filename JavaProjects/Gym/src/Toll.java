public class Toll {
    Tollbooth tollbooth = new Tollbooth();
    double totalBalance;
    public void paymentAccepting(Customer customer)
    {
        totalBalance += customer.Charge();
        tollbooth.manageCustomer(customer);
    }
}
