import java.util.Scanner;

public class Miles{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        
    
        System.out.println("Miles Per gallon Program. Enter 0 to quit");
       
        System.out.println("Enter initial miles");
        int intMiles = scan.nextInt();
         while(intMiles>0){
        System.out.println("Enter final miles");
        int finalMiles = scan.nextInt();
        System.out.println("Gallons");
        int gallons = scan.nextInt();

        int mpg = (finalMiles-intMiles)/gallons;

        System.out.println("Miles per gallon is  " + mpg);
        }
        System.out.println("ok goodbye");
    }
}