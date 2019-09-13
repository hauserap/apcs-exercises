import java.util.Scanner;

public class Pie{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your weight in pounds");
         double weight= scan.nextInt();

        if( weight<=280 && weight>=220 ){
            System.out.println("You can enter the contest");
        } else {
            System.out.println("You can't be in the contest loser");
        }



    }
}