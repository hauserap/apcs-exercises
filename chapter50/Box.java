public class Box{
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length){
        this.height = height;
        this.width = width;
        this.length = length;
    } 
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }

    public double GetArea(){
        return (this.height * this.width * this.length);
    }
}