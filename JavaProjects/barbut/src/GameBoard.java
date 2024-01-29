import java.util.Scanner;
public class GameBoard {
    public void playGame(Player player1,Player player2,Scanner scanner)
    {
        int turn = 1;
        boolean gameIsFinished = false;
        player1.isTurn = true;
        player2.isTurn = false;
        while(!gameIsFinished)
        {
            if(player1.isTurn && !player1.isLose)
            {
                System.out.printf("\nTurn %d\n\nPlayer1 pls roll the dice type ('R')...",turn);
                String input2 = scanner.nextLine();
                if(input2.equals("R"))
                {
                    if(turn == 1)
                    {
                        player1.state = player1.turn1();
                        if(player1.state == 0)
                        {
                            player1.score++;
                            player1.isTurn = false;
                            player2.isTurn = true;
                            gameIsFinished = true;
                            System.out.print("\nPlayer1 won. Game will start again with Player2.\n");
                        }    
                        else if(player1.state == 1)
                        {
                            player1.isLose = true;
                            player1.isTurn = false;
                            player2.isTurn = true;
                            System.out.print("\nPlayer1 lost.\n");
                        }
                        else
                        {
                            if(player2.isLose)
                            {
                                System.out.print("Player1 will roll again");
                                turn++;
                            }
                            else if(player2.state == 2)
                            {
                                turn++;
                                player1.isTurn = false;
                                player1.state = -1;
                                player2.isTurn = true;
                                player2.state = -1;
                                System.out.print("Player1 will roll if Player2 will not win.\n");
                            }
                            else
                            {
                                player1.isTurn = false;
                                player2.isTurn = true;
                                System.out.print("Player1 will roll if Player2 will not win.\n");
                            }
                        }
                    }
                    else if(turn == 2)
                    {
                        player1.state = player1.turn2();
                        if(player1.state == 0)
                        {
                            turn = 1;
                            player1.score++;
                            player1.isTurn = false;
                            player2.isTurn = true;
                            gameIsFinished = true;
                            System.out.print("\nPlayer1 won. Game will start again with Player2.\n");
                        }
                        else if(player1.state == 1)
                        {
                            player1.isLose = true;
                            player1.isTurn = false;
                            player2.isTurn = true;
                            System.out.print("\nPlayer1 lost.\n");
                        }
                        else
                        {
                            if(player2.isLose)
                            {
                                System.out.print("Player1 will roll again");
                                turn++;
                            }
                            else if(player2.state == 2)
                            {
                                turn++;
                                player1.isTurn = false;
                                player1.state = -1;
                                player2.isTurn = true;
                                player2.state = -1;
                                System.out.print("Player1 will roll if Player2 will not win.\n");
                            }
                            else
                            {
                                player1.isTurn = false;
                                player2.isTurn = true;
                                System.out.print("Player1 will roll if Player2 will not win.\n");
                            }                
                        }        
                    }
                    else
                    {
                        player1.state = player1.turn3();
                        if(player1.state == 0)
                        {
                            turn = 1;
                            player1.score++;
                            player1.isTurn = false;
                            player2.isTurn = true;
                            gameIsFinished = true;
                            System.out.print("\nPlayer1 won. Game will start again with Player2.\n");
                        }
                        else if(player1.state == 1)
                        {
                            player1.isLose = true;
                            player1.isTurn = false;
                            player2.isTurn = true;
                            System.out.print("\nPlayer1 lost.\n");
                        }
                        else
                        {
                            if(player2.isLose)
                            {
                                System.out.print("Player1 will roll again");
                                turn++;
                            }
                            else if(player2.state == 2)
                            {
                                turn++;
                                player1.isTurn = false;
                                player1.state = -1;
                                player2.isTurn = true;
                                player2.state = -1;
                                System.out.print("Player1 will roll if Player2 will not win.\n");
                            }
                            else
                            {
                                player1.isTurn = false;
                                player2.isTurn = true;
                                System.out.print("Player1 will roll if Player2 will not win.\n");
                            }
                        }
                    }
                    System.out.printf("Dices = (%d,%d)\n",player1.diceNumber1,player1.diceNumber2);     
        
                }
                else
                {
                    System.out.printf("\nYou have entered wrong input");
                
                }
            }
            else if(player2.isTurn && !player2.isLose)
            {
                System.out.printf("\nTurn %d\n\nPlayer2 pls roll the dice type ('R')...",turn);
                String input3 = scanner.nextLine();
                if(input3.equals("R"))
                {   
                    if(turn == 1)
                    { 
                        player2.state = player2.turn1();
                        if(player2.state == 0)
                        {
                            player2.score++;
                            player1.isTurn = true;
                            player2.isTurn = false;
                            gameIsFinished = true;
                            System.out.print("\nPlayer2 won. Game will start again with Player1.\n");
                        }
                        else if(player1.state == 1)
                        {
                            player2.isLose = true;
                            player1.isTurn = true;
                            player2.isTurn = false;
                            System.out.print("\nPlayer2 lost.\n");
                        } 
                        else
                        {
                            if(player1.isLose)
                            {
                                System.out.print("Player2 will roll again");
                                turn++;
                            }
                            else if(player1.state == 2)
                            {
                                turn++;
                                player1.isTurn = true;
                                player1.state = -1;
                                player2.isTurn = false;
                                player2.state = -1;
                                System.out.print("Player2 will roll if Player1 will not win.\n");
                            }
                            else
                            {
                                player1.isTurn = true;
                                player2.isTurn = false;
                                System.out.print("Player2 will roll if Player1 will not win.\n");
                            }
                        }
                    }
                    else if(turn == 2)
                    {
                        player2.state = player2.turn2();
                        if(player2.state == 0)
                        {
                            turn = 1;
                            player2.score++;
                            player1.isTurn = true;
                            player2.isTurn = false;
                            gameIsFinished = true;
                            System.out.print("\nPlayer2 won. Game will start again with Player1.\n");
                        }
                        else if(player2.state == 1)
                        {
                            player2.isLose = true;
                            player1.isTurn = true;
                            player2.isTurn = false;
                            System.out.print("\nPlayer2 lost.\n");
                        }
                        else
                        {
                            if(player1.isLose)
                            {
                                System.out.printf("Player2 will roll again");
                                turn++;
                            }
                            else if(player1.state == 2)
                            {

                                turn++;
                                player1.isTurn = true;
                                player1.state = -1;
                                player2.isTurn = false;
                                player2.state = -1;
                                System.out.print("Player2 will roll if Player1 will not win.\n");
                            }
                            else
                            {
                                player1.isTurn = true;
                                player2.isTurn = false;
                                System.out.print("Player2 will roll if Player1 will not win.\n");
                            }
                                
                        }
                        
                    }
                    else
                    {
                        player2.state = player2.turn3();
                        if(player2.state == 0)
                        {
                            turn = 1;
                            player2.score++;
                            gameIsFinished = true;
                            player1.isTurn = true;
                            player2.isTurn = false;
                            System.out.print("\nPlayer2 won. Game will start again with Player1.\n");
                        }
                        else if(player2.state == 1)
                        {
                            player2.isLose = true;
                            player1.isTurn = true;
                            player2.isTurn = false;
                            System.out.print("\nPlayer2 lost.\n");
                        }
                        else
                        {
                            if(player1.isLose)
                            {
                                System.out.print("Player2 will roll again");
                                turn++;
                            }
                            else if(player1.state == 2)
                            {
                                turn++;
                                player1.isTurn = true;
                                player1.state = -1;
                                player2.isTurn = false;
                                player2.state = -1;
                                System.out.print("Player2 will roll if Player1 will not win.\n");
                            }
                            else
                            {
                                player1.isTurn = true;
                                player2.isTurn = false;
                                System.out.print("Player2 will roll if Player1 will not win.\n");
                            }
                        }
                    } 
                    System.out.printf("Dices = (%d,%d)\n",player2.diceNumber1,player2.diceNumber2);                 
                }
                else
                {
                    System.out.printf("\nYou have entered wrong input.");
                }     
            }
            else
            {
                turn = 1;
                player1.isLose = false;
                player2.isLose = false;
                gameIsFinished = true;
                System.out.printf("\nBoth player lost. Game will start again.");
            }
        }
    }
}
