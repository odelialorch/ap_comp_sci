
/**
 * Write a description of class RunsTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RunsTest
{
    public static void main()
    {
        DieRolls rolls = new DieRolls();
        rolls.print();
        System.out.println("\n");
        rolls.printRuns();
        System.out.println("\n");
        rolls.printMaxRuns();
    }
}
