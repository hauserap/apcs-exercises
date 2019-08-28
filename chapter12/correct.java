import java.util.Scanner;

public class Correct{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter dollar amount");

        double dollars;
        double quarters; 
        double dimes;
        double nickels; 
        double pennies; 

        double change = scan.nextInt();

        dollars = change/100;
        quarters = (change-(dollars * 100))/25;
        dimes = (change-(dollars*100)-(quarters*25))/10;
        nickels = (change-(dollars*100)-(quarters*25)-(dimes*10))/5;
        pennies = (change-(dollars*100)-(quarters*25)-(dimes*10)-(nickels*5))/1;

        System.out.println("dollars is"+ dollars+"quarters is"+quarters+"dimes is"+dimes+"nickels is"+nickels+"pennies is"+pennies);

    }
}