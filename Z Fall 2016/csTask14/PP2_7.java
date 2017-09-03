
/**
 * Converts from seconds to hours/minutes/seconds.
 * 
 * @odelialorch
 * @10/13/16
 */
import java.util.Scanner;

public class PP2_7
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of seconds:");
        int seconds = scan.nextInt();
        
        int hours = (int) seconds/3600;
        int minutes = (int) (seconds - 3600*hours)/60;
        int seconds2 = (int) seconds - 3600*hours-60*minutes;
        
        System.out.println("This equals "+hours+" hours, "+minutes+" minutes, and "+seconds2+" seconds.");
    }
}