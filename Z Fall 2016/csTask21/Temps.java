
/**
 * Gives the maximum and minimum temperatures over 24 hours.
 * 
 * @author (odelialorch) 
 * @version (11/4/16)
 */
// **********************************************************
// Temps.java
//
// This program reads in a sequence of hourly temperature
// readings (beginning with midnight) and prints the maximum
// temperature (along with the hour, on a 24-hour clock, it
// occurred) and the minimum temperature (along with the hour
// it occurred).
// **********************************************************
import java.util.Scanner;
public class Temps
{
    //----------------------------------------------------
    // Reads in a sequence of temperatures and finds the
    // maximum and minimum read in.
    //----------------------------------------------------
    public static void main (String[] args)
    {
        final int HOURS_PER_DAY = 24;
        int temp, timeOfMax, timeOfMin, maxTemp, minTemp; // a temperature reading
        Scanner scan = new Scanner(System.in);
        // print program heading
        System.out.println ();
        System.out.println ("Temperature Readings for 24 Hour Period");
        System.out.println ();
        maxTemp = -1000;
        minTemp = 1000;
        timeOfMax = 0;
        timeOfMin = 0;
        for (int hour = 0; hour < HOURS_PER_DAY; hour++)
        {
            System.out.print ("Enter the temperature reading at " + hour +
                " hours: ");
            temp = scan.nextInt();
            if (temp > maxTemp)
            {
                maxTemp = temp;
                timeOfMax = hour;
            }
            if (temp < minTemp)
            {
                minTemp = temp;
                timeOfMin = hour;
            }    
        }
        // Print the results
        System.out.println("The maximum temperature over 24 hours was "+maxTemp+
                            " degrees at "+timeOfMax+":00.");
        System.out.println("The minimum temperature over 24 hours was "+minTemp+
                            " degrees at "+timeOfMin+":00."); 
    }
}