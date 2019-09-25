import java.util.Scanner;
public class Sum{

    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert n");
        int n = scan.nextInt();
        int oddSum=0;
        double nS = Math.pow(n,n);
        for(int odd = 1 ; odd<=n ; odd+=2){
            oddSum+=odd;
            System.out.println(odd); 
        }
        System.out.println("The sum is " + oddSum);
        System.out.println("N^2 is " + nS);
    }
}