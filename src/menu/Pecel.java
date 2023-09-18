package menu;
import java.util.Scanner;

public class Pecel extends AbstractDish {
    private boolean is_spicy;

    public Pecel(){
        super("Pecel", 10000);
        this.setOrder();
    }

    public void getDescription()
    {
        System.out.printf("Nama\t\t: %s%n", super.name);
        System.out.printf("Harga\t\t: %d%n", super.price);
        System.out.printf("Bumbu Pedas\t: %s%n", is_spicy());
    }

    private String is_spicy()
    {
        if(this.is_spicy){
            return "Ya";
        }else{
            return "Tidak";
        }
    }

    public void setOrder()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bumbu pecel pedas?");
        System.out.println("0. Ya");
        System.out.println("1. Tidak");
        this.is_spicy = (scanner.nextInt()==0)?true:false;

        scanner.close();
    }
}
