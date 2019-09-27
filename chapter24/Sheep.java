import java.util.Scanner;

public class Sheep{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of years");
        double t = scan.nextInt();

        double sheep = 220*(1 + 10*0.83*t);

        System.out.println(sheep);

    }
    
}