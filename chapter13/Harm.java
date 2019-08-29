import java.util.Scanner;

public class Harm{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X");
        double x = scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter Y");
        double y = scan.nextDouble();

        double harmonic = 2/(1/x +1/y);
        double arithmetic = (x+y)/2;

        System.out.println("Harmonic mean:"+harmonic);
        System.out.println("Arithemic mean:" + arithmetic);
    }
}

