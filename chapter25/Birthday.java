public class Birthday{
public static void main(String[] args){
    int[] birthday = new int[200];

    for(int i = 0; i<20;i++){
        Collision(birthday); 
    }
}

public static int Collision(int birthday[]){
    Random rand = new Random();  
    for(int i = 1; i<birthday.length;i++){        
        birthday[i] = rand.nextInt(365);
    }

    int count = 0;        
    for(int i = 0; i<birthday.length; i++){          
        for(int j= i+1 ; j<birthday.length; j++){            
            if (birthday[i] == birthday[j]){               
                count++;
            }            
        }          
    }

    System.out.print(count+" ");        
    return count;  
}
}