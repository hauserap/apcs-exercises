import java.util.Scanner;
public class Wallpaper{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the width of the room in inches :");
        Double width = Double.parseDouble(scan.nextLine());

        System.out.println("What is the length of the room in inches :");
        Double length = Double.parseDouble(scan.nextLine());

        System.out.println("What is the combined area of the openings in the room in inches :");
        Double area = Double.parseDouble(scan.nextLine());

        Double covered = (width*length)-area;
        Double rolls = Math.ceil(covered/27.0);

        System.out.println("You need "+ rolls + " rolls of wallpaper");






    }
}