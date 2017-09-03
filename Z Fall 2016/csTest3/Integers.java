/**
 * Asks the user to enter a list of positive integers and prints the number of integers, the total, and the average.
 * 
 * @author (odelialorch) 
 * @version (11/22/16)
 */
import java.util.Scanner;
public class Integers
{
    public static void main()
    {
        // Declares variables
        Scanner scan = new Scanner(System.in);
        int num, count, total;
        double average;
        
        // Intializes variables
        count = 0;
        total = 0;
        average = 0.0;
        
        // Asks for and defines the next number
        System.out.print("Enter a positive integer (-1 to stop): ");
        num = scan.nextInt();
        
        // Checks if the number was not a positive integer or -1 and asks the user to try again.
        if (num <= 0 && num != -1)
        {
            System.out.print("That was not a positive integer. Please try again (-1 to stop): ");
            num = scan.nextInt();
        }
        
        // Updates the count, total, and num values while the number is still a positive integer.
        while (num != -1)
        {
            count++;
            total += num;
            System.out.print("Enter a positive integer (-1 to stop): ");
            num = scan.nextInt();
            if (num <= 0 && num != -1)
            {
                System.out.print("That was not a positive integer. Please try again (-1 to stop): ");
                num = scan.nextInt();
            }  
        }
        
        // Prints the count, total, and average, unless the user entered no positive integers.
        if (count == 0)
            System.out.println("You entered no positive integers.\n");                                                                 
        else 
        {
            average = (double) total / count;
            System.out.println("You entered " + count + " positive integers. \nTotal = " + total + "\nAverage = " + average + "\n");
        }
    }
}

/**
 * SAMPLE OUTPUT
 * 
 * Enter a positive integer (-1 to stop): 1
 * Enter a positive integer (-1 to stop): 2
 * Enter a positive integer (-1 to stop): 3
 * Enter a positive integer (-1 to stop): 4
 * Enter a positive integer (-1 to stop): 5
 * Enter a positive integer (-1 to stop): -1
 * You entered 5 positive integers.
 * Total = 15
 * Average = 3.0
 * 
 * Enter a positive integer (-1 to stop): 10
 * Enter a positive integer (-1 to stop): 10
 * Enter a positive integer (-1 to stop): 10
 * Enter a positive integer (-1 to stop): -10
 * That was not a positive integer. Please try again (-1 to stop): 10
 * Enter a positive integer (-1 to stop): 0
 * That was not a positive integer. Please try again (-1 to stop): 10
 * Enter a positive integer (-1 to stop): -1
 * You entered 5 positive integers. 
 * Total = 50
 * Average = 10.0
 * 
 * Enter a positive integer (-1 to stop): 21
 * Enter a positive integer (-1 to stop): 36
 * Enter a positive integer (-1 to stop): 93
 * Enter a positive integer (-1 to stop): 55
 * Enter a positive integer (-1 to stop): 72
 * Enter a positive integer (-1 to stop): 47
 * Enter a positive integer (-1 to stop): 01
 * Enter a positive integer (-1 to stop): -1
 * You entered 7 positive integers. 
 * Total = 325
 * Average = 46.42857142857143
 * 
 */