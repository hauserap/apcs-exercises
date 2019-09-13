import java.util.Scanner;

public class Age{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");

        int yearAge = scan.nextInt();

        System.out.println("Enter number of months since last birthday");
        int monthAge = scan.nextInt();

        System.out.println("Enter day of the month");
        int dayAge = scan.nextInt();

        int ageInSec = (yearAge*31536000)+(dayAge*86400)+(monthAge * 2678400);

        double million = 2.5E9;
        double percentLife = (ageInSec/million)*100;

        System.out.println("your age in seconds is"+ ageInSec);
        System.out.println("the percent your lifespan you haved lived is"+ percentLife+ "%");




    }
}