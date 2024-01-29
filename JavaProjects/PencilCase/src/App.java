import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PencilCase pencilCase = new PencilCase();
        boolean exit = false;
        System.out.print("How many slots do you want. You can choose max 10 slot: ");
        int slotsNumber = scanner.nextInt();
        pencilCase.CreateSlot(slotsNumber,scanner);

        while(!exit)
        {
            System.out.print("For add pencil press A. For take press T. To exit press E: ");
            String action = scanner.next();
            if(action.equals("A"))
            {
                System.out.print("Please enter slot number that you want: ");
                int slotIndex = scanner.nextInt();
                if(slotIndex <= slotsNumber)
                {
                    System.out.print("Please enter unit number to add: ");
                    int unitNumber = scanner.nextInt();
                    pencilCase.AddPencil(slotIndex, unitNumber);
                }
                else
                {
                    System.out.printf("There is no %d slot\n",slotIndex);
                }
            }
            else if(action.equals("T"))
            {
                System.out.print("Please enter slot number that you want");
                int slotIndex = scanner.nextInt();
                if(slotIndex <= slotsNumber)
                {
                    System.out.print("Please enter unit number to take: ");
                    int unitNumber = scanner.nextInt();
                    pencilCase.TakePencil(slotIndex, unitNumber);
                }
                else
                {
                    System.out.printf("There is no %d slot\n",slotIndex);
                }
            }
            else if(action.equals("E"))
            {
                exit = true;
            }
            else
            {
                System.out.print("Wrong Input");
            }
        }
        System.out.printf("Overall you have %d pencil in pencilcase",pencilCase.CalculateTotalPencil(slotsNumber));
        scanner.close();
        return;

    }
}

