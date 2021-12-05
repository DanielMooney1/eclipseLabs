package lab8;

public class Cylinder extends ThreeDShape{
    private double radius;
    private double height;

    public Cylinder(String name,String colour, double radius,double height)
    {
        super(name, colour);
        this.radius = radius;
        this.height = height;
    }
    
}
