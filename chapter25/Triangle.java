import java.util.Scanner;
public class Triangle{
     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
       int triangular = 0;
       for(int i = scan.nextInt();i=i;i++) {
           triangular = triangular + i;
            System.out.println("Triangular Number for "+ i +" is "+triangular);
       }

    }
     
}