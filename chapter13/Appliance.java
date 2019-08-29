import java.util.Scanner;

public class Appliance{
     public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
         System.out.println("Enter cost per kilowatt-hour in cents");
         float x = scan.nextInt();
         Scanner scan2 = new Scanner (System.in);
         System.out.println("Enter kilowatt hours used per year");
         float y = scan2.nextInt();

         float cost = x*y;

         System.out.println("Annual cost is:" + cost);

        
    }


}