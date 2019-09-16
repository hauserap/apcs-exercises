import java.util.Scanner;

public class Fantasy{
    public static void main(String [] args){

        System.out.println("Welcome to the Kings Legacy!");

        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Enter your characters name");

        String inData = scan.nextLine();

        System.out.println("Your characters name is " + inData);

        System.out.println("Enter your values for Strength, Health, and Luck. Total value can not exceed 15!");

        System.out.println("Enter your strength amount (1-10)");
        int inDataS = scan.nextInt();
        System.out.println("Your strength is " + inDataS);

        System.out.println("Enter your health amount (1-10)");
        int inDataH = scan.nextInt();
        System.out.println("Your health is " + inDataH);

        System.out.println("Enter your luck amount (1-10)");
        int inDataL = scan.nextInt();
        System.out.println("Your luck is " + inDataL);

        int total = inDataH + inDataL + inDataS;

        if(total>15){
            System.out.println("You're total value can't exceed 15! Default values have been assigned.");
            System.out.println(" Strength is " + 5 + " Health is " + 5 + " Luck is " + 5);
        } else {
            System.out.println("You look good! Good luck!");
        }



    }
}