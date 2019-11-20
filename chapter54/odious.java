import java.util.*;
public class odious{
    public static  boolean isOdious(int n){
        
        int sum=0;
        while(n>0){
            if(n%2==1)
            {
                sum++;
            }
                n=n/2;
        }
        if(sum%2==1)
        {
            System.out.print("odious number");
            return true;
        }
        else
        {
            System.out.println("evil number");
            return false;
        }
    }
    public static void main(String[] args)
    {
        int i,m;
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        for(i=0;i<m;i++)
        {
            if(isOdious(i))
            {
                System.out.println(i);
            }
        }
    }
}