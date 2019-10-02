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

        System.out.println("you will play 3 rounds. Good luck!");

        double number = random.nextInt(100)+1;

        System.out.println("What is the square root of " + number );
    }
}