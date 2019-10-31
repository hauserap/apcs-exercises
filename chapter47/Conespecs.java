public class Conespecs{

    private String name;
    private double height ;
    private double radius ;
    private double slant;
    private double angle;

    public Cone(String name , double height, double radius, double slant, double angle){
        this.name = name;

        this.height = height;
        this.radius = radius;
        this.slant = slant;
        this.angle = angle;
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
        public double getSlant(){
            return this.slant;
        }
        public double getAngle(){
            return this.angle;
        }

        




    }

