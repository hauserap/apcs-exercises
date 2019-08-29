import java.util.Scanner;

public class Brick{
 public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.println("number of seconds");
     float x = scan.nextFloat();
     double distance = .5*32.174*x*x;

     System.out.println("distance is :  " + distance);

    
    
}

}