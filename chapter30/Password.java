import java.util.Scanner;
import java.util.Random;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter password 5 letters or less in all lowercase");
        String password = scan.nextLine();

        String guess = "";

        String chara = "abcdefghijklmnopqrstuvwxyz ";
        int attempts;
        int t = 0;
        for (attempts = 0; !guess.equals(password); attempts++) {
            guess = "";
            for(t = 0; t < 5; t++) {

                guess += chara.charAt(random.nextInt(chara.length()));
            }
        }
        System.out.println("Here is your password: " + guess);
        System.out.println("It took " + attempts + " tries to guess it");
    }
}