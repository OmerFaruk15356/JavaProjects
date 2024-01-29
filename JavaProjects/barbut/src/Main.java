import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();      
        GameBoard gameBoard = new GameBoard();
        boolean isGameOver = false;
        System.out.println("\nGame is loading...\n");
        while(!isGameOver)
        {
            System.out.print("\nIf you want to start/continue game press ('G'),To see scoreboard press ('S') or you can finish game with ('E')...");
            String input = scanner.nextLine();
            if(input.equals("G"))
            {
                gameBoard.playGame(player1,player2,scanner);
            }
            else if(input.equals("S"))
            {
                System.out.printf("\nScoreboard\n----------\nPlayer1 = %d\nPlayer2 = %d\n",player1.score,player2.score);
            }
            else if(input.equals("E"))
            {
                System.out.printf("\nGame is finishing...");
                isGameOver = true;
            }
            else
            {
                System.out.printf("\nYou have entered wrong input.");
            }
       }
       scanner.close();
    }
}
