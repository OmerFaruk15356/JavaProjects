import java.util.Random;
public class Dice 
{
    private Random rand = new Random();
    public int possibility()
    {
        return rand.nextInt(6) + 1;
    }
    public int Rolled()
    {
        return possibility();
    }
}
