
/**
 * Represents a list of grades and their cutoff scores.
 * 
 * @author (odelialorch) 
 * @version (2/6/17)
 */
public class Grade
{
    String grade;
    int cutoff;
    
    public Grade(String letter, int num)
    {
        grade = letter;
        cutoff = num;
    }
    
    public String grade()
    {
        return grade;
    }
    
    public int cutoff()
    {
        return cutoff;
    }
}
