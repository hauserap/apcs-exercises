import java.util.Scanner;

public class Sequential{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N");

        int n = scan.nextInt();

        if(n>1){
            int sum = (n*(n+1))/2;

            System.out.println(sum);
        }
    }
}