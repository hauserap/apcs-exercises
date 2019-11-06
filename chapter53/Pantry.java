import java.util.Scanner;

public class Pantry{
    public static void main (String [] args){

        PTester gooseberry = new PTester("gooseberry" , 12);
        PTester crabApple = new PTester ("crab apple" , 8);
        PTester rhubarb = new PTester ("rhubarb" , 16);

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to your moms pantry! ");
        
        String name = gooseberry.getName();
        int oz = gooseberry.getOz();
        System.out.println("the jam is " + name + "   the fluid ounces is " + oz);
        name = crabApple.getName();
        oz = crabApple.getOz();
        System.out.println("the jam is " + name + "   the fluid ounces is " + oz);
        name = rhubarb.getName();
        oz = rhubarb.getOz();
        System.out.println("the jam is " + name + "   the fluid ounces is " + oz);

        System.out.println("what kind do you want? 1 is gooseberry, 2 is crab apple, 3 is rhubarb. Press 4 to quit");

        int n = scan.nextInt();

        if(n==1){
            System.out.println("you chose gooseberry. how much do you want on your toast?");
            int a = scan.nextInt();
            System.out.println("there is now " + (gooseberry.getOz()-a) + " ounces left in your jar of gooseberry");
        }

        if(n==2){
            System.out.println("you chose crab apple. Gross. How much do you want on your toast?");
            int b = scan.nextInt();
            System.out.println("there is now " + (crabApple.getOz() - b) + " ounces left in your jar of crab apple");
            if((crabApple.getOz()-b)<=0){
                System.out.println("you are all out. that is ok because it is gross");
            }

        }

        if (n==3){
            System.out.println("you chose rhubarb. How much do you want on your toast");
            int c = scan.nextInt();
            System.out.println("there is now " + (rhubarb.getOz() - c) + " ounces left in your jar of rhubarb");

        }
        if(n==4){
            System.out.println("goodbye");
        }





    

    }
}