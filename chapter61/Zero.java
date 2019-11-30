public class Zero {    
    public static void main(String[] args) {    
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};    
        int curr = 0;    
        int near = data[0];     
    
        for ( int i=0; i < data.length; i++ ){    
            curr = data[i] * data[i];     
            if ( curr <= (near * near) )  {     
                near = data[i]; 
            }     
        }    
        System.out.println( near );    
    }    
}