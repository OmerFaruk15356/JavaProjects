public class Guest extends Customer{

    @Override
    public double Charge()
    {
        this.charge = charge * 2;
        return this.charge;
    }
    
}
