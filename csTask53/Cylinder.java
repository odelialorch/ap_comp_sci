/**
 * Represents a cylinder.
 * 
 * @author (odelialorch) 
 * @version (3/9/17)
 */
public class Cylinder extends Shape
{
    private double radius; //radius in feet
    private double height;

    /** Constructor: Sets up the sphere. */
    public Cylinder(double r, double h)
    {
        super("Cylinder");
        radius = r;
        height = h; 
    }
    
    /** Returns the surface area of the sphere. */
    public double area()
    {
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    
    /** Returns the sphere as a String. */
    public String toString()
    {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
