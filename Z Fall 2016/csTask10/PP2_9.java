
/**
 * Write a description of class PP2_9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PP2_9
{
    public static void main(double radius)
    {
        final double pi = 3.14159;
        
            // volume and surface area, not rounded
        double volume = (4.0/3.0)*pi*radius*radius*radius;
        double surfaceArea = 4.0*pi*radius*radius;
        
            // rounds volume and surface area to 4 decimal places
        volume = (int)volume+((int)(((volume - (int)(volume)) * (double)(10*10*10*10))+.5)*0.0001);
        surfaceArea = (int)surfaceArea+((int)(((surfaceArea - (int)(surfaceArea)) * (double)(10*10*10*10))+.5)*0.0001);
        
            // prints out volume and surface area
        System.out.println("Volume: "+volume);
        System.out.println("Surface Area: "+surfaceArea);
    }
}
        