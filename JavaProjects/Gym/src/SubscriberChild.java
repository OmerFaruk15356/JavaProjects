public class SubscriberChild extends Subscriber{
    
    @Override
    public double Charge()
    {
        this.charge = charge * 0.5;
        return this.charge;
    }
}
