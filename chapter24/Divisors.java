import java.util.Scanner;
public class Divisors {
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter the number:");
    int number=scan.nextInt();
    int n = 0;
    
         for(int i = 1; i <= number; i++) {
             if (number % i == 0) {
                 n = n + i; 
             }
             
         
         }
         System.out.println("The Sum Of The Divisors is: ");
         System.out.println(n);
}
}