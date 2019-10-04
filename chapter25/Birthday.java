import java.util.Scanner;
public class Birthday{

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        int numPeople;
        final double days = 365;
        double p = 1;

        System.out.println("How many people are there at the party:");
        numPeople = scan.nextInt();

        for(int i = 1; i <= numPeople; i++) {
            if (i == 1) {
                p = (days - (i - 1)) / days;
            }else {
                p = p * ((days - (i - 1)) / days);
            }
        }
        System.out.println("The possibility is nobody will have the same birthday is " + p);

        int x = 0;
        p = 1;
        for(x = 1; p >= 0.5; x++) {
            if (x == 1) {
                p = (days - (x - 1)) / days;
            }else {
                p = p * ((days - (x - 1)) / days);
            }
        }
    }
}