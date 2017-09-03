
/**
 * Reads a string from the user and prints it out one character per line.
 * 
 * @author (odelialorch) 
 * @version (11/14/16)
 */
import java.util.Scanner;
public class Problem1
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        int len, index;
        String string;
        
        System.out.println("Enter a word or phrase:");
        string = scan.nextLine();
        
        len = string.length();
        
        for (index = 0; index < len; index++)
        {
            char ch = string.charAt(index);
            System.out.println(ch);
        }
    }
}
