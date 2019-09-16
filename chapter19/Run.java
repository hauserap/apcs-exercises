import java.util.Scanner;

public class Run{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start number");
        int start = scan.nextInt();
        System.out.println("Enter end number");
        int end = scan.nextInt();
        while(start<end){
            start = start +1;
            System.out.println(start);
        }
    }
}