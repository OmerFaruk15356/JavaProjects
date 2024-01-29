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
        return rand.nextInt(100) + 1;
    }
    public int rolled()
    {   
        int number = 0;
        int ratio = possibility();
        if(ratio > 0 && ratio <= 5)
        {
            number = 1;
            side[number - 1]++;
        }
        else if(ratio > 5 && ratio <= 15)
        {
            number = 2;
            side[number - 1]++;
        }
         else if(ratio > 15 && ratio <= 35)
        {
            number = 3;
            side[number - 1]++;
        }
         else if(ratio > 35 && ratio <= 40)
        {
            number = 4;
            side[number - 1]++;
        }
         else if(ratio > 40 && ratio <= 45)
        {
            number = 5;
            side[number - 1]++;
        }
         else if(ratio > 45 && ratio <= 50)
        {
            number = 6;
            side[number - 1]++;
        }
         else if(ratio > 50 && ratio <= 55)
        {
            number = 7;
            side[number - 1]++;
        }
         else if(ratio > 55 && ratio <= 60)
        {
            number = 8;
            side[number - 1]++;
        }
         else if(ratio > 60 && ratio <= 70)
        {
            number = 9;
            side[number - 1]++;
        }
         else if(ratio > 70 && ratio <= 100)
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
