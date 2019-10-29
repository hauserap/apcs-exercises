public class Conespecs{
    private double height ;
    private double radius ;
    private double slant;
    private double angle;

    public Cone (double height, double radius, double slant, double angle){
        this.height = height;
        this.radius = radius;
        this.slant = slant;
        this.angle = angle;


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

        public double calcualteArea(){
           return (Math.PI* radius* (radius+Math.Sqrt((height*height)+(radius*radius))));
        }




    }

}