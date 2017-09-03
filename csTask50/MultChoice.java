/**
 * Represents a multiple choice test question.
 * 
 * @author (odelialorch) 
 * @version (3/3/17)
 */
import java.util.Scanner;
public class MultChoice extends TestQuestion
{
    private int numChoices;
    private String[] choices;
    private String question;
    
    public void readQuestion(Scanner fileScan)
    {
        numChoices = Integer.parseInt(fileScan.nextLine());
        question = fileScan.nextLine();
        choices = new String[numChoices];
        for (int i = 0; i < numChoices; i++)
            choices[i] = fileScan.nextLine();
    }
    
    public String toString()
    {
        String[] letter = {"a) ", "b) ", "c) ", "d) ", "e) ", "f) "};
        String str = question;
        for (int j = 0; j < numChoices; j++)
            str += "\n" + letter[j] + choices[j];
        return str;
    }
}