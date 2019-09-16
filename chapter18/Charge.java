import java.util.Scanner;

public class Charge{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert you checking account balance");

        int checking = scan.nextInt();
        System.out.println("Your checking balance is  " + checking);
        System.out.println("Enter your savings account balance ");
        int savings = scan.nextInt();
        System.out.println("Your savings balance is  " + savings);

        if (checking<1000 || savings>=1500){
            System.out.println(".15 fee for written checks ");
        } else {
            System.out.println("No service fee charge");
        }

        
    }
}