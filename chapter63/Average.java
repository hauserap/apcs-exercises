class Weight
{
  int[] value = {98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
  
  public int average()
  {
    int total = 0;
for(int i = 0; i < value.length; i++) {
    total += value[i];
}
int avg = total / value.length;

return avg;

  }

  

}

public class Average
{  
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
                    
    Weight june = new Weight( values );
    int avg = june.average();
    System.out.println("average = " + avg );
  }
}      