public class CTester{
    public static void main(String [] args){
        Cylinder a = new Cylinder ("a", 15.1,16.9);

        String name = a.getName();
        System.out.println("the cylinder is cylinder " + name);
        double height = a.getHeight();
        System.out.println("the height is  " + height);
        double radius = a.getRadius();
        System.out.println("the radius is "+ radius);
        double volume = a.getVolume();
        System.out.println("the volume is " + volume);
    }
}