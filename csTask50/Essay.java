/**
 * Represents an essay test question.
 * 
 * @author (odelialorch) 
 * @version (3/3/17)
 */
import java.util.Scanner;
public class Essay extends TestQuestion
{
    private int numLines;
    private String question;
    
    public void readQuestion(Scanner fileScan)
    {
        numLines = Integer.parseInt(fileScan.nextLine());
        question = fileScan.nextLine();
    }
    
    public String toString()
    {
        String str = question;
        for (int i = 1; i <= numLines; i++)
            str += "\n";
        return str;
    }
}
