import java.util.Scanner;

public class ohm{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        Scanner scan2 = new Scanner (System.in);
        System.out.println("enter Voltage variable");
        double v = scan.nextInt();
        System.out.println("enter resistance variable");
        double r = scan2.nextInt();

        

        double amps = (v + 0.0)/r;

        System.out.println("amps is" + amps);




    }
}