/**
 * Firm.java demonstrates polymorphism via inheritance.
 * 
 * @author Lewis/Loftus modified by DJC
 * @version 3/16/2016
 */
public class Firm
{
    /** Creates a staff of employees for a firm and pays them. */
    public static void main (String[] args)
    {
        Staff personnel = new Staff();
        personnel.payday();
    }
}