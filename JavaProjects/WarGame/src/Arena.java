import java.util.Scanner;

public class Arena {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player();
        Player player2 = new Player();
        Scanner scaner = new Scanner(System.in);
        player1.isTurn = true;
        player2.isTurn = false;
        System.out.println("Game is starting");
        PlayGmae(player1, player2,scaner);
    }

    public static void PlayGmae(Player player1,Player player2,Scanner scaner)
    {
        while(!player1.isDead() && !player2.isDead())
        {
            
            System.out.print("For bullet: Bullet. To shoot: Shoot. To shield: Shield..");
            String action = scaner.nextLine();

            if(action.equals("Bullet"))
            {
                if(player1.isTurn)
                {
                    player1.Reload();
                    player1.isTurn = false;
                    player2.isTurn = true;
                    System.out.println("Player 1 reload");
                }
                else if(player2.isTurn)
                {
                    player2.Reload();
                    player1.isTurn = true;
                    player2.isTurn = false;
                    System.out.println("Player 2 reload");
                }
            }
            else if(action.equals("Shoot"))
            {
                if(player1.isTurn)
                {
                    if(player1.gun.ammo > 0)
                    {
                        if(player1.gun.isHasRocket())
                        {
                            player2.healtPlayer -= 50;
                            System.out.println("Player 1 use rocket");
                            continue;
                        }
                        if(player2.isHasShield)
                        {
                            player2.isHasShield = false;
                            System.out.println("Player 2 shield down");
                        }
                        else
                        {
                            player2.Shoot();
                            System.out.println("Player 2 got damage");
                        }
                        player1.gun.ammo --;
                    }
                    else
                    {
                        System.out.println("Player 1 dont have bullet");
                    }
                    player1.isTurn = false;
                    player2.isTurn = true;
                }
                else if(player2.isTurn && player2.gun.ammo > 0)
                {
                    if(player2.gun.ammo > 0)
                    {
                        if(player2.gun.isHasRocket())
                        {
                            player1.healtPlayer -= 50;
                            System.out.println("Player 2 use rocket");
                            continue;
                        }
                        if(player1.isHasShield)
                        {
                            player1.isHasShield = false;
                            System.out.println("Player 1 shield down");
                        }
                        else
                        {
                            player1.Shoot();
                            System.out.println("Player 1 got damage");
                        }
                        player2.gun.ammo --;
                    }
                    else
                    {
                        System.out.println("Player 2 dont have bullet");
                    }
                    player1.isTurn = true;
                    player2.isTurn = false;
                }
            }
            else if(action.equals("Shield"))
            {
                if(player1.isTurn)
                {
                    player1.Shield();
                    player1.isTurn = false;
                    player2.isTurn = true;
                    System.out.println("Player 1 got shield");
                }
                else if(player2.isTurn)
                {
                    player2.Shield();
                    player1.isTurn = true;
                    player2.isTurn = false;
                    System.out.println("Player 2 got shield");
                }
            }
            else
            {
                System.out.println("Wrong input");
            }
            
        }
    }
}
