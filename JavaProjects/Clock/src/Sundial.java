public class Sundial extends Clock{

    public Sundial(int hour, int minute) {
        super(hour, minute);
    }
    
    @Override
    public void TellMeTime()
    {
        if(GetHour() >= 0 && GetHour() < 12)
        {
            System.out.println("Morning");
        }
        else if(GetHour() >= 12 && GetHour() < 18)
        {
            System.out.println("Afternoon");
        }
        else if(GetHour() >= 18 && GetHour() < 24)
        {
            System.out.println("Evening");
        }
    }
    
}
