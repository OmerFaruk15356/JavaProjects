public class Tollbooth {

    int[] typeCustomer = new int[4];


    public void manageCustomer(Customer customer)
    {
        if(customer instanceof GuestChild)
        {
            typeCustomer[0]++;
        }
        else if (customer instanceof Guest)
        {
            typeCustomer[1]++;
        }
        else if(customer instanceof SubscriberChild)
        {
            typeCustomer[2]++;
        }
        else if(customer instanceof Subscriber)
        {
            typeCustomer[3]++;
        }

    }

}
