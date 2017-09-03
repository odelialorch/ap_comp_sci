/**
 * Generates three random lucky numbers.
 * 
 * @odelialorch 
 * @10/13/16
 */
// **************************************************
// LuckyNumbers.java
//
// To generate three random "lucky" numbers
// **************************************************
import java.util.Random;

public class LuckyNumbers
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        int lucky1, lucky2, lucky3;
        // Generate lucky1 (a random integer between 50 and 79, inclusive)
        // using the nextInt method (with no parameter)
        lucky1 = (Math.abs(generator.nextInt())) % 30 + 50;
        // Generate lucky2 (a random integer between 90 and 100, inclusive)
        // using the nextInt method with an integer parameter
        lucky2 = (Math.abs(generator.nextInt())) % 11 + 90;
        // Generate lucky3 (a random integer between 11 and 30, inclusive)
        // using the random method of the Math class
        lucky3 = (Math.abs(generator.nextInt())) % 20 + 11;
        System.out.println ("Your lucky numbers are " + lucky1 + ", " + lucky2
            + ", and " + lucky3);
    }
}
