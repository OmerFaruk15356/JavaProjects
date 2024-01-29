public class Player { 
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    boolean isTurn,isLose;
    int diceNumber1;
    int diceNumber2;
    int score,state,sum;
    public Player()
    {
        this.isLose = false;
        this.isTurn = false;
    }
    public void GetNumber()
    {
        diceNumber1 = dice1.Rolled();
        diceNumber2 = dice2.Rolled();
    }
    public int turn1()
    {
        GetNumber();

        if((diceNumber1 == 6 && diceNumber2 == 6) || 
        (diceNumber1 == 5 && diceNumber2 == 5) ||
        (diceNumber1 == 3 && diceNumber2 == 3) ||
        (diceNumber1 == 6 && diceNumber2 == 5))
        {
            return 0;
        }
        else if((diceNumber1 == 4 && diceNumber2 == 4) || 
        (diceNumber1 == 2 && diceNumber2 == 2) ||
        (diceNumber1 == 1 && diceNumber2 == 1) ||
        (diceNumber1 == 2 && diceNumber2 == 1)) 
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
    public int turn2()
    {
        GetNumber();
        if(diceNumber1 + diceNumber2 == 7 || diceNumber1 + diceNumber2 == 11)
        {
            return 0;
        }
        else if(diceNumber1 + diceNumber2 == 2 || diceNumber1 + diceNumber2 == 3 || diceNumber1 + diceNumber2 == 12)
        {
            return 1;
        }
        else
        {
            sum = diceNumber1 + diceNumber2;
            return 2;
        }
    }
    public int turn3()
    {
        GetNumber();
        if(sum == diceNumber1 + diceNumber2)
        {
            return 0;
        }
        else if(diceNumber1 + diceNumber2 == 7)
        {
            return 1;
        }
        else
        {
            sum = diceNumber1 + diceNumber2;
            return 2;
        }
    }
}
