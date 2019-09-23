import java.util.Scanner;
public class Harmonic{

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");

        Integer n = Integer.parseInt(scan.nextLine());
        Double sum = 0.0;
        Double totalSum = 0.0;
        System.out.println(n);
        while(n>0.0){
            sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + 1.0/n;
            System.out.println(sum);
            totalSum = totalSum + sum;
            n--;      
        }
        System.out.println("Sum is: " + totalSum);
    }
}