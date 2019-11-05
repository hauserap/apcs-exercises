public class BTester{
    public static void main(String [] args){
        Box a = new Box(12.4, 5.8, 17.9);

        double height = a.getHeight();
        System.out.println("height is " + height);
        double width = a.getWidth();
        System.out.println("width is " + width);
        double length = a.getLength();
        System.out.println("length is " + length);
        double area = a.GetArea();
        System.out.println("area is " + area);
    }
}