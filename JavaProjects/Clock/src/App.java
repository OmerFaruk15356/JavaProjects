public class App {
    public static void main(String[] args) throws Exception {
        Clock clock = new Clock(6, 30);
        TellMeTheTime(clock);

        WristWatch wristWatch = new WristWatch(6,30);
        TellMeTheTime(wristWatch);
        wristWatch.AngleBetweenArms();

        CuckcooClock cuckcooClock = new CuckcooClock(12,30);
        TellMeTheTime(cuckcooClock);

        Sundial sundial = new Sundial(15, 24);
        TellMeTheTime(sundial);
    }

    public static void TellMeTheTime(Clock clock)
    {
        clock.TellMeTime();
    }
}
