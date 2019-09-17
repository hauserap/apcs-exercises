import java.util.Scanner;

public class Dots{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = scan.nextLine();
        System.out.println("your first word is  " + word1);
        System.out.println("Enter your second word");
        String word2 = scan.nextLine();
        System.out.println("your second word is  " + word2);

        String twoWords = word1 +"   " + word2;

        System.out.println(twoWords);



        
    }
}