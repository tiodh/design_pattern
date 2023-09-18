package menu;
import java.util.Scanner;

public class PlacingOrder {
    public void ordering()
    {
        Scanner scanner = new Scanner(System.in);
        AbstractDish dish = null;
        
        System.out.println("Pilih menu:");
        System.out.println("0. Pecel");
        System.out.println("1. Soto");
        int menu = scanner.nextInt();

        if(menu==0)
        {
            dish = new Pecel();
        }
        else if(menu==1)
        {
            dish = new Bakso();
        }

        dish.getDescription();
    }
}
