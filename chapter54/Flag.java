import java.util.*;

public class Flag{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int param = 0;
        System.out.println("enter a number");
        int x = scan.nextInt();
        
        if(x<0 || x>20){
           param = -1;
           System.out.println(param);
        } else {
            System.out.println("error free");
        }
        
    }
}