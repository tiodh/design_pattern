package menu;

import java.util.Scanner;

public class Bakso extends AbstractDish {
    private int bakso_type;
    private final String[] BAKSO_TYPES = {"Pentol Halus", "Pentol Kasar"};

    public Bakso(){
        super("Bakso", 15000);
        this.setOrder();
    }

    public void getDescription()
    {
        System.out.printf("Nama\t: %s%n", super.name);
        System.out.printf("Harga\t: %d%n", super.price);
        System.out.printf("Jenis Pentol\t: %i%n", BAKSO_TYPES[this.bakso_type]);
    }

    public void setOrder()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bumbu pecel pedas?");
        System.out.println("0. Pentol Halus");
        System.out.println("1. Pentol Kasar");
        this.bakso_type = scanner.nextInt();
        
        scanner.close();
    }
}
