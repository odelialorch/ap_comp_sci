
/**
 * Abstract class Shape - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Shape
{
    private String shapeName;
    
    public Shape(String name)
    {
        shapeName = name;
    }
    
    public abstract double area();
    
    public String toString()
    {
        return shapeName;
    }
}
