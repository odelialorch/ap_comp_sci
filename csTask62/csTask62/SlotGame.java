
/**
 * Write a description of class SlotGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SlotGame
{
    private int num1;
    private int num2;
    private int num3;
    private String outcome;
    
    private static int count3;
    private static int count2;
    private static int count0;
    
    public SlotGame()
    {
        num1 = (int) (Math.random()*10);
        num2 = (int) (Math.random()*10);
        num3 = (int) (Math.random()*10);
        
        if (num1==num2 && num2 == num3)
        {
            outcome = "All three numbers are the same";
            count3++;
        }
        else if (num1 == num2 || num2 == num3 || num3 == num1)
        {
            outcome = "Two numbers are the same";
            count2++;
        }
        else 
        {
            outcome = "No repeats";
            count0++;
        }
    }
    
    public String toString()
    {
        String str = "\n" + num1 + " " + num2 + " " + num3 + "\nOutcome: " + outcome;
        return str;
    }
    
    public static void printSummary()
    {
        System.out.println("\nTotal with three same numbers: " + 
    }
}
