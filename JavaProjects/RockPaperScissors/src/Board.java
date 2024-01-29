import java.util.Scanner;

public class Board {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();

        int decision1;
        int decision2;

        System.out.print("Please Player 1 select your decision [1] Rock [2] Paper [3] Scissors ");
        decision1 = scanner.nextInt();
        player1.getDecision(decision1);
        System.out.print("Please Player 2 select your decision [1] Rock [2] Paper [3] Scissors ");
        decision2 = scanner.nextInt();
        player2.getDecision(decision2);


        if(player1.getDecision(decision1) == player2.getDecision(decision2))
        {
            System.out.println("Tie");
        }
        else if((player1.getDecision(decision1) == "Rock" && player2.getDecision(decision2) == "Scissors") ||
        (player1.getDecision(decision1) == "Scissors" && player2.getDecision(decision2) == "Paper") ||
        (player1.getDecision(decision1) == "Paper" && player2.getDecision(decision2) == "Rock")
        )
        {
            System.out.println("Player1 win");
        }
        else
        {
            System.out.println("Player2 win");
        }
        scanner.close();

    }
}
