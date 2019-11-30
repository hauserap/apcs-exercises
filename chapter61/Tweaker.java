import java.util.*;

public class Tweaker{
    public static void main(String [] args){
        double[] data = {13, 5.6,6.2,6.0,5.5,5.7,6.1,7.4,5.5,5.5,6.3,6.4,4.0,6.9};

        double average = (Arrays.stream(data).sum())/13;

        System.out.println("the average is  " +average);
    }
}