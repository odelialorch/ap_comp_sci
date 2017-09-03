
/**
 * Programming Project 3.2: Determines whether inputted years are leap years or not.
 * 
 * @odelialorch 
 * @10/24/16
 */
import java.util.Scanner;

public class PP3_2
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        
        if (year >=1582)
            if ((year%4) == 0)
                if ((year%100) == 0)
                    if ((year%400) == 0)   
                        System.out.println("This year is a leap year!");
                    else
                        System.out.println("This year is not a leap year.");
                else
                   System.out.println("This year is a leap year!"); 
            else 
                System.out.println("This year is not a leap year.");
        else 
            System.out.println("Error: this year is before 1582, when the Gregorian calendar was "
                + "adopted");
    }
}
            