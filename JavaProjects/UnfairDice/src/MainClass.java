import java.util.Scanner;
public class MainClass{
    public static void main (String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        Dice dice = new Dice();
        System.out.print("How many times do you want to roll: ");
        int rollTime = scanner.nextInt();
        scanner.close();
        while(dice.rollCount <= rollTime)
        {
            System.out.println(dice.rollCount + ". dice -> " + dice.rolled());
            dice.rollCount++;
        }
        System.out.println("\nDice has been Rolled " + rollTime +  " times.\n");
        dice.report();
    }
    
}