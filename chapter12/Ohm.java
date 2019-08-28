import java.util.Scanner;

public class ohm{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        Scanner scan2 = new Scanner (System.in);
        System.out.println("enter V variable");
        double v = scan.nextInt();
        System.out.println("enter r variable");
        double r = scan2.nextInt();

        

        double amps = v/r;

        System.out.println("amps is" + amps);




    }
}