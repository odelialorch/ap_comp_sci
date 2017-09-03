/**
 * Prints and counts messages declaring love for computer science.
 * 
 * @odelialorch
 * @10/31/16
 */
//****************************************************************
// LoveCS.java
//
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times should this message be printed?");
        int limit = scan.nextInt();
        int count = 1;
        while (count <= limit)
        {
            System.out.println(count+" I love Computer Science!!");
            count++; // a convenient abbreviation for: count = count + 1;
        }
        
        int sum = 0;
        int N = count-1;
        while (N > 0)
        {
            sum = sum + N;
            N = N-1;
        }
        System.out.println("Printed this message "+(count-1)+" times. The sum of the numbers from "
                            +" 1 to "+(count-1)+" is "+sum+".");
    }
}