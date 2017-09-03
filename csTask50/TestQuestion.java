
/**
 * Represents a test question.
 * 
 * @author (odelialorch) 
 * @version (3/3/17)
 */
import java.util.Scanner;
public abstract class TestQuestion
{
    protected String question;
    
    public abstract void readQuestion(Scanner fileScan);
}
