import java.util.Scanner;
import java.util.Random;

public class Farkle{
    public static void main(String [] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        

        System.out.println("welcome to farkle. What is your name?");
        String name = scan.nextLine();
        if(name.equals("tayler")){
            System.out.println("tayler isn't allowed to play. Please leave now");
        }
        System.out.println("Hello " + name);
        

       

        // for(int rolls = 3; rolls>0 ; rolls--){
        //     int dice = random.nextInt(6)+1;
        //     System.out.println("it is "+ name + "'s turn to roll");
        //     System.out.println("dice is " + dice);
        //     if(dice==1){
        //         System.out.println("you get 100 pts");
        //     } if else(dice == 2){
        //         System.out.println("you get 200 pts");
        //     } if else(dice == 3){
        //         System.out.println("you get 300 pts");
        //     } if else(dice ==4){
        //         System.out.println("you get 400 pts");
        //     }else{
        //         System.out.println("you get 500 pts");
        //     }
            
        // }






       

        

    }
}