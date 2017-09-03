
/**
 * Write a description of class RPSLS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RPSLS
{
    private static int wins;
    private static int losses; 
    private static int ties;
    
    private HandChoice comp;
    private HandChoice user;
    private String result;
    
    public RPSLS(HandChoice u)
    {
        user = u;
        comp = new HandChoice();
        
        if (user.compareTo(comp) == 0)
        {
            result = "t";
            ties++;
        }
        else if (user.compareTo(comp) > 0)
        {
            result = "w";
            wins++;
        }
        else if (user.compareTo(comp) < 0)
        {
            result = "l";
            losses++;
        }
    }
    
    public String toString()
    {
        String str = "\nUser: " + user.getChoice() + "\nComputer: " + comp.getChoice();
        if (result.equals("w"))
            str += "\nUser wins!";
        else if (result.equals("l"))
            str += "\nComputer wins!";
        else 
            str += "\nIt's a tie!";
        return str; 
    }
    
    public static String results()
    {
        return "\nWins: " + wins + "\nLosses: " + losses + "\nTies: " + ties;
    }
}
