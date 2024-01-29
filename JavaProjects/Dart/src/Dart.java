import java.util.Random;

public class Dart {
    Random random = new Random();
    int possibility,score;

    public int GetPosibility()
    {
        possibility = random.nextInt(100) + 1;
        return possibility;
    }

    public void ThrowDart()
    {
        GetPosibility();

        if(possibility <= 6)
        {
            System.out.println("Missed");
        }
        else
        {
            score = random.nextInt(20) + 1;
            if(possibility > 6 && possibility <= 10)
            {
                if(possibility < 10)
                {
                    System.out.println("Landed on outer, You got 25 point");
                }
                else
                {
                    System.out.println("Landed on inner, You got 50 point");
                }
            }
            else if(possibility > 10 && possibility <= 20)
            {
                System.out.printf("Landed on triple, You got %d point\n",score * 3);
            }
            else if(possibility > 20 && possibility <= 40)
            {
                System.out.printf("Landed on double, You got %d point\n",score * 2);
            }
            else if(possibility > 40 && possibility <= 100)
            {
                System.out.printf("Landed on single, You got %d point\n",score);
            }
        }
    }
}
