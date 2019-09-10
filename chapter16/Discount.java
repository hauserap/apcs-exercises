import java.util.Scanner;

public class Discount{

    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter purchases");
        double x = scan.nextInt();
        double y = x*.2;
        double z = x-y;

        if (x>10) {
            System.out.println("You get 10% off. This is your new price  "+ z);

        } else {
            System.out.println("You get no discount, price isn't over 10");
        }

    }
}