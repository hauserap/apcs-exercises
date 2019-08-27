import java.util.Scanner;

public class echo
{
  public static void main (String[] args) 
  {
    String inData;
    Scanner scan = new Scanner( System.in );

    System.out.println("age:");
    inData = scan.nextLine();

    System.out.println("Your age:" + inData);

  }
}