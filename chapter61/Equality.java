import java.util.Arrays;

public class Equality
{
  public static boolean myEquals( int[] a, int[] b )
  {
      return false;
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };

    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayE, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( Arrays.equals( arrayE, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }
}