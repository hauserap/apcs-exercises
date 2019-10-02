import java.util.Scanner;
import java.util.Random;

public class Walk{
    public static void main(String [] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        double x =0;
        double y=0;

        double steps = random.nextInt(1)-1;

        double xSteps = x + steps;
        double ySteps = y + steps;

        double distance = ((xSteps*xSteps)+(xSteps*xSteps)/2);

        System.out.println("you traveled  " + xSteps + "  on the x axis and   " + ySteps + "  on the y axis");
        System.out.println("your distance is   " + distance);


    }
}