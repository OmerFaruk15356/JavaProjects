public class Clock {

    private int hour;
    private int minute;
    public Clock(int hour,int minute)
    {
        SetHour(hour);
        SetMinute(minute);
    }

    public void SetHour(int hour)
    {
        this.hour =  hour;
    }
    public void SetMinute(int minute)
    {
        this.minute =  minute;
    }
    public int GetHour()
    {
        return this.hour;
    }
    public int GetMinute()
    {
        return this.minute;
    }
    public void TellMeTime()
    {
        System.out.printf("Time is %02d:%02d\n",GetHour(),GetMinute());
    }
}
