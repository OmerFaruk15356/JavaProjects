public class Arena {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player();
        Player player2 = new Player();
        player1.name = "Subzero";
        player2.name = "Scorpion";

        System.out.printf("Winner is %s",StartGame(player1,player2).name);
    }

    public static Player StartGame(Player player1, Player player2)
    {
        System.out.println("Game is Starting..");
        player1.isTurn = true;
        player2.isTurn = false;

        while(player1.isAlive && player2.isAlive)
        {
            if(player1.isTurn && !player2.isTurn)
            {
                if(player1.isAttack() && !player2.isDefend())
                {
                    player2.playerHealt -= 20;
                }
                    player1.isTurn = false;
                    player2.isTurn = true;
                }
            else if(player2.isTurn && !player1.isTurn)
            {
                if(player2.isAttack() && !player1.isDefend())
                {
                    player1.playerHealt -= 20;
                }
                player1.isTurn = true;
                player2.isTurn = false;
            }
            if(player1.playerHealt <= 0)
            {
                player1.isAlive = false;
                return player2;
            }
            if(player2.playerHealt <= 0)
            {
                player2.isAlive = false;
                return player1;
            }
        }
        return null;
    }
}


