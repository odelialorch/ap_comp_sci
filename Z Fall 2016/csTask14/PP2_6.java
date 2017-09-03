
/**
 * Converts from hours/minutes/seconds to seconds.
 * 
 * @odelialorch
 * @10/13/16
 */

import java.util.Scanner;

public class PP2_6
{
   public static void main()
   {
       int hours, minutes, seconds;
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter the number of hours:");
       hours = scan.nextInt();
       
       System.out.println("Enter the number of minutes:");
       minutes = scan.nextInt();
       
       System.out.println("Enter the number of seconds:");
       seconds = scan.nextInt();
       
       int time = (hours*3600)+(minutes*60)+seconds;
       
       System.out.println("This equals "+time+" seconds.");
    }
}
       