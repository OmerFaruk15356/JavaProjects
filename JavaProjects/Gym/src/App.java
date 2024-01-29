public class App {
    public static void main(String[] args) throws Exception {
        SubscriberChild subscriberChild = new SubscriberChild();
        Guest guest = new Guest();
        Toll toll = new Toll();
        Report report = new Report();
        toll.paymentAccepting(subscriberChild);
        toll.paymentAccepting(guest);
        report.totalBalanceReport(toll.totalBalance);
    }
}
