
/**
 * Reads three integers from the user and prints their average.
 * 
 * @odelialorch 
 * @10/5/2016
 */
// *******************************************************************
// Read three integers from the user and print their average
// *******************************************************************
import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        int val1, val2, val3;
        double average;
        Scanner scanIn = new Scanner(System.in) ;
        // get three values from user
        System.out.println("Please enter three integers and " +
            "I will compute their average");
        val1 = scanIn.nextInt();
        val2 = scanIn.nextInt();
        val3 = scanIn.nextInt();
            //compute the average
        average = (val1+val2+val3)/3.0;
            //print the average
        System.out.println("The average is "+average);
    }
}
