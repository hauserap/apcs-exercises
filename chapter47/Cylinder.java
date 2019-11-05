public class Cylinder{

    private String name;
    private double height;
    private double radius;


    public Cylinder (String name, double height , double radius){
        this.name = name;
        this.height = height;
        this.radius = radius;
    }

    public String getName(){
        return this.name;
    }
    public double getHeight(){
        return this.height;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getVolume(){
       return Math.PI*(this.radius * this.radius)*this.height;
    }

    

}