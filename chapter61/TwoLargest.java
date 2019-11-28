import java.util.Scanner;

public class TwoLargest{
    public static void  main( String [] args) {

        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
         int max = getMax(data);
    System.out.println("Maximum Value is: "+max);




       

    
        
    }
     public static int getMax(int[] intputData){ 
    int maxValue = intputData[0]; 
    for(int i=1;i < intputData.length;i++){ 
      if(intputData[i] > maxValue){ 
         maxValue = intputData[i]; 
      } 
    } 
    return maxValue; 
     
  }

  public static int getSec(int[] intputData){
      int secValue = inputData[0];
      for)int p =1;i<(inputData.length-1);p++){
          if(inputData[p]> secValue){
              secValue = intputData[p-1];
          }
      }

      return secValue;

  }
  
}