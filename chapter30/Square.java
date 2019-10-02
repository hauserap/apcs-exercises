import java.util.Scanner;
import java.util.Random;

public class Square{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter your username player 1");
        String user1 = scan.nextLine();
        System.out.println("enter your username player 2");
        String user2 = scan.nextLine();
        System.out.println("User 1 is " + user1 + " User 2 is " + user2 );

        System.out.println("how many rounds?");

        for(int rounds= scan.nextInt(); rounds>0; rounds--){
            double number = random.nextInt(100)+1;
            System.out.println("what is the square root of  " + number);
            double answer = Math.sqrt(number);
            System.out.println("what is your answer  " + user1 +" ?");
            double answer1 = scan.nextDouble();
            System.out.println("what is your answer  " + user2 +" ?");
            double answer2 = scan.nextDouble();
            int points1 = 0;
            int points2 = 0;
            if(Math.abs(answer1-answer) <= Math.abs(answer2-answer)){
                System.out.println(user1 + " is closer! " + user1 +" gets the point!");
                points1=points1+1;
            } else{
                System.out.println(user2 + " Is closer  " +user2 + " gets the point!");
                points2=points2+1;
            }
            System.out.println("current score: " + user1 + " has " + points1 + "   " +user2 + "  has " + points2);



           
           
        }
       
        
    }
}