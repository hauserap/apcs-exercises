import java.util.Scanner;

public class Order{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);

        int bolt;
        int nut;
        int washer;

        int boltCost = 5;
        int nutCost = 3;
        int washerCost =1;

        System.out.println("Enter number of bolts");
        bolt = scan.nextInt();
        System.out.println("Enter number of nuts");
        nut = scan.nextInt();
        System.out.println("Enter number of washers");
        washer = scan.nextInt();

        if (washer*2<= bolt){
            System.out.println("too few washers");
        } else if (nut<=bolt) {
            System.out.println("too few nuts");
        } else {
            System.out.println(" looks good");
        }

        double orderCost = (bolt*boltCost)+(nut*nutCost)+(washer*washerCost);
        System.out.println("Order Cost:" + orderCost);



    }


}