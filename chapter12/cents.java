import java.until.Scanner;

public class cents{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents amount");
        double amount = scan.nextInt();

        double equal = amount/100;

        System.out.println("that is "+ equal +"dollars");
    }
}