import java.util.Scanner;
public class PencilCase {
    Slot[] slots;
    boolean isOpen;
    int totalPencil;

    public PencilCase()
    {
        this.slots = new Slot[10];
        this.isOpen = true;
        this.totalPencil = 0;
    }

    public void CreateSlot(int count,Scanner scanner)
    {
        for(int i = 0 ; i < count ; i++)
        {
            slots[i] = new Slot();
            System.out.printf("How many capacity should %d. slot have: ",i + 1);
            slots[i].capacity = scanner.nextInt();
        }
    }

    public void AddPencil(int number,int unit)
    {
        if(slots[number - 1].countPencill + unit < slots[number - 1].capacity )
        slots[number - 1].countPencill += unit;
        else
        {
            System.out.printf("You cant put in %d pencil. You can just put %d more pencil\n",unit, 
             slots[number - 1].capacity - slots[number - 1].countPencill);
        }
    }

    public void TakePencil(int number,int unit)
    {
        if(slots[number - 1].countPencill - unit > 0  )
        slots[number - 1].countPencill -= unit;
        else
        {
            System.out.printf("You cant take off %d pencil. You can just take %d more pencil\n",unit, 
            slots[number - 1].countPencill);
        }
    }

    public int CalculateTotalPencil(int maxSlotsIndex)
    {
        for(int i = 0 ; i < maxSlotsIndex ; i++)
        {
            totalPencil += slots[i].countPencill;
        }
        return totalPencil;
    }

}


