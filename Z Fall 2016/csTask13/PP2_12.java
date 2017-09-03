
/**
 * Programming Project 2.13: reads quantities of different coins and prints the sum of their values.
 * 
 * @odelialorch
 * @10/7/16
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class PP2_12
{
    public static void main()
    {
        Scanner scan = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Enter the number of quarters:");
        double quarters = scan.nextInt();
        
        System.out.println("Enter the number of dimes:");
        double dimes = scan.nextInt();
        
        System.out.println("Enter the number of nickels:");
        double nickels = scan.nextInt();
        
        System.out.println("Enter the number of pennies:");
        double pennies = scan.nextInt();
        
        double value = (0.25*quarters)+(0.10*dimes)+(0.05*nickels)+(0.01*pennies);
        
        System.out.println("The total value is "+money.format(value));
    }
}
        