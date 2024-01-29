public class CuckcooClock extends Clock{

    public CuckcooClock(int hour, int minute) {
        super(hour, minute);
    }

    @Override
    public void TellMeTime()
    {
        int count = 0;
        while(count < GetHour())
        {
            System.out.println("Coo Coo");
            count++;
        }
    }
    
}
