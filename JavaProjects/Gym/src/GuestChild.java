public class GuestChild extends Subscriber{
    @Override
    public double Charge()
    {
        this.charge = charge * 1.5;
        return this.charge;
    }
}
