
/**
 * Programming Project 2.10: calculates and prints the area of a triangle using Heron's formula.
 * 
 * @odelialorch
 * @10/7/16
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class PP2_10
{
   public static void main()
   {
       Scanner scan = new Scanner (System.in);
       DecimalFormat fmt = new DecimalFormat ("0.###");
       
       System.out.println("Enter the triangle sidelengths:");
       
       double a = scan.nextDouble();
       double b = scan.nextDouble();
       double c = scan.nextDouble();
       double s = (a+b+c)/2;
       
       double part1 = s*(s-a)*(s-b)*(s-c);
       double part2 = Math.sqrt(part1);
       String area = fmt.format(part2);
       
       System.out.println("The area of this triangle is "+area);
    }
}
       