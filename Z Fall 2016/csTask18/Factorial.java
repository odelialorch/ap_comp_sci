
/**
 * Computes the factorial of an input number.
 * 
 * @odelialorch 
 * @10/31/16
 */
import java.util.Scanner;
public class Factorial
{
    public static void main()
    {
     int num;
     int N = 1;
     int factorial = 1; 
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a non-negative integer:");
     num = scan.nextInt();
     while (num < 0)
     {
        System.out.println("A non-negative integer is required. Please try again:");
        num = scan.nextInt();
     }
     if (num > 0)
     {
        while (N <= num)
        {
            factorial = factorial * N;
            N++;
        }
        System.out.println("The factorial of this integer is "+factorial+".");
     }
     else 
        System.out.println("The factorial of this integer is 0.");
    }
}
