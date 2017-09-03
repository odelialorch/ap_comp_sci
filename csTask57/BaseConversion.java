/**
 * Recursively converts an integer from base 10 to another base
 */
import java.util.Scanner;

public class BaseConversion
{
  public static void main (String[] args)
  {
    int base10Num;
    int base;
    Scanner scan = new Scanner(System.in);
    System.out.println ();
    System.out.println ("Base Conversion Program");
    System.out.print ("Enter an integer: ");
    base10Num = scan.nextInt();
    System.out.print ("Enter the base: ");
    base = scan.nextInt();
    // Call convert and print the answer
    System.out.println(convert(base10Num, base));
  }

  /**
   * Converts a base 10 number to another base.
   */ 
  public static String convert (int num, int b)
  {
    int quotient; // the quotient when num is divided by base b
    String remainder; // the remainder when num is divided by base b
    quotient = num / b;
    if (num % b == 10)
        remainder = "A";
    else if (num % b == 11)
        remainder = "B";
    else if (num % b == 12)
        remainder = "C";
    else if (num % b == 13)
        remainder = "D";
    else if (num % b == 14)
        remainder = "E";
    else if (num % b == 15)
        remainder = "F";
    else
        remainder = "" + num % b;
    if (quotient == 0)//fill in base case
    {
        return ("" + remainder);
    } 
    else
    {
        // Recursive step: the number is the base b
        // representation of
        // the quotient concatenated with the remainder
        return ("" + convert(quotient, b) + remainder); 
    }
  }
}
