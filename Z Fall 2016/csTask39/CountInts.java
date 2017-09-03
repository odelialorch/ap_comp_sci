/**
 * Counts the number of times each number from -25 to 25 is input.
 * 
 * @author (odelialorch) 
 * @version (1/13/17)
 */
import java.util.Scanner;
public class CountInts
{
    public static void main ()
    {
        int[] range = new int[51];
        final int upperLimit = 50;
        final int lowerLimit = 0;
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter an integer between -25 and 25 inclusive (26 to quit): ");
        num = scan.nextInt();
        
        while (num != 26)
        {
            num += 25;
            range[num]++;
            System.out.print("Please enter an integer between -25 and 25 inclusive (26 to quit): ");
            num = scan.nextInt();
        }
        
        System.out.println("\nNumber: \tTimes entered:");
        for (int i = 0; i < 51; i++)
            System.out.println((i-25) + ": \t" + range[i]);
    }
}
