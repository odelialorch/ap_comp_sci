/**
 * Represents a rectangle.
 * 
 * @author (odelialorch) 
 * @version (3/9/17)
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;
    
    public Rectangle(double len, double wid)
    {
        super("Rectangle");
        length = len;
        width = wid;
    }
    
    public double area()
    {
        return length * width;
    }
    
    public String toString()
    {
        return super.toString() + "of length " + length + " and width " + width;
    }
}
