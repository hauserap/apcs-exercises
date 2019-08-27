import java.util.Scanner;

public class circle{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the radius :)");
       double radius = scan.nextInt();

        double equal = Math.PI * radius * radius;

        System.out.println(" area is "+ equal);
    }
}