public class Jar {
    public int capacity,countMarble ;
    public boolean isLidOpen;

    Jar()
    {
        this.capacity = 10;
        this.countMarble = 0;
        this.isLidOpen = false;
    }

    public void AddMarble(int number)
    {
        for(int i = 1 ; i <= number ; i++)
        {
            if(isLidOpen)
            {
                if(countMarble < capacity)
                {
                    countMarble++;
                }
                else
                {
                    System.out.printf("You have reached max capacity, just add %d marble. You have %d marble\n",--i,countMarble);
                    return;
                }
            }
            else
            {
                System.out.printf("Lid is closed you cant add marble. You have %d marble\n",countMarble);
                return;
            }
        }
        System.out.printf("You add %d marble\n",number);
    }
    public void TakeOutMarble(int number)
    {
        for(int i = 1 ; i <= number ; i++)
        {
            if(isLidOpen)
            {
                if(countMarble > 0)
                {
                    countMarble--;
                }
                else
                {
                    System.out.printf("There is no marble in jar, just takeout %d marble. You have %d marble\n", --i,countMarble);
                    return;
                }
            }
            else
            {
                System.out.printf("Lid is closed you cant take out marble. You have %d marble\n",countMarble);
                return;
            }
        }
        System.out.printf("You take out %d marble\n",number);
    }
}
