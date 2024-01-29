import java.util.Random;

public class Dice {
    private Random rand = new Random();
    int[] side;
    int rollCount;

    public Dice()
    {
        this.side = new int[10];
        this.rollCount = 1;
    }
    public int possibility()
    {
        return rand.nextInt(10) + 1;
    }
    public int rolled()
    {   
        int number = 0;
        int ratio = possibility();
        if(ratio == 1)
        {
            number = 1;
            side[number - 1]++;
        }
        else if(ratio == 2)
        {
            number = 2;
            side[number - 1]++;
        }
         else if(ratio == 3)
        {
            number = 3;
            side[number - 1]++;
        }
         else if(ratio == 4)
        {
            number = 4;
            side[number - 1]++;
        }
         else if(ratio == 5)
        {
            number = 5;
            side[number - 1]++;
        }
         else if(ratio == 6)
        {
            number = 6;
            side[number - 1]++;
        }
         else if(ratio == 7)
        {
            number = 7;
            side[number - 1]++;
        }
         else if(ratio == 8)
        {
            number = 8;
            side[number - 1]++;
        }
         else if(ratio == 9)
        {
            number = 9;
            side[number - 1]++;
        }
         else if(ratio == 10)
        {
            number = 10;
            side[number - 1]++;
        }
        
        return number;
    }
    public void report()
    {
        for(int i = 0 ; i < side.length ; i++)
        {
            if(i == 5)
            System.out.print("\n");
            System.out.print((i + 1) + ": -> " + side[i] + "  ");
        }
    }
}
