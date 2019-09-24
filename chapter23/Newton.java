import java.util.Scanner;

public class Newton{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N value. Press 0 to quit.");
        double n = scan.nextDouble();
        while (n>0){
            double x = n * (2-4*n);
            System.out.println(x);
        }
        

        
    }
}