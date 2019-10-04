import java.util.Random;
import java.util.Scanner;
public class Pigs{

    public static void main (String []args){

        Random random = new Random();
        int cpuPoints = 0;
        int dice = random.nextInt(18)+1;
        int cpuDice = random.nextInt(18)+1;
        int playerPoints = 0;
        
        for(int rollsRemaining = 3; playerPoints<100 && rollsRemaining>0; rollsRemaining--){
            playerPoints+=dice;
            System.out.println("The player has rolled " + dice + " points");
            playerPoints = playerPoints + dice;
            System.out.println("players has " + playerPoints);
            System.out.println("computer rolled " + cpuDice + " points");
            cpuPoints = cpuPoints + dice;
            System.out.println("computer has " + cpuPoints);
            


        }
    }
}