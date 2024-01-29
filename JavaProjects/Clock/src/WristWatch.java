public class WristWatch extends Clock{

    public WristWatch(int hour, int minute) {
        super(hour, minute);
    }

    @Override
    public void TellMeTime()
    {
        if(GetHour() >= 0 && GetHour() < 12)
        {
            System.out.printf("Time is %02d:%02d AM\n",GetHour(),GetMinute());
        }
        else if(GetHour() >= 12 && GetHour() < 24)
        {
            System.out.printf("Time is %02d:%02d P\n",GetHour(),GetMinute());
        }
    }   

    public void AngleBetweenArms()
    {
        double angleHour = (GetHour() * 360)/24;
        double angleMinute = (GetMinute() * 360)/60;
        double angle = Math.abs(angleHour - angleMinute);
        System.out.print("Angle = " + angle + "\n");
    }
    
}
