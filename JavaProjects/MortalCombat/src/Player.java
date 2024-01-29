import java.util.Random;

public class Player {
    public int playerHealt;
    public int score;
    public String name;
    public double pAttack;
    public double pDefend;
    public boolean isAlive;
    public boolean isTurn;

    public Player()
    {
        this.playerHealt = 100;
        this.score = 0;
        this.pAttack = 0.5;
        this.pDefend = 0.25;
        this.isAlive = true;
    }

    public boolean isAttack()
    {
        Random random1 = new Random();
        double possibility = random1.nextDouble();

        if(possibility <= this.pAttack)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        public boolean isDefend()
    {
        Random random2 = new Random();
        double possibility = random2.nextDouble();

        if(possibility <= this.pDefend)
        {
            
            return true;
        }
        else
        {
            return false;
        }
    }
}
