
/**
 * Reads an integer and prints the number of odd digits, even digits, and digits that are zero.
 * 
 * @author (odelialorch) 
 * @version (11/14/16)
 */
import java.util.Scanner;
public class Problem2
{
    public static void main()
    {
      Scanner scan = new Scanner(System.in);
      int num, len, index;
      int zeros, odds, evens;
      String numString;
      int currentDigit;
      
      System.out.println("Enter an integer:");
      num = scan.nextInt();
      numString = String.valueOf(num);
      len = numString.length();
      index = 0;
      
      zeros = 0;
      odds = 0;
      evens = 0;
      
      if (numString.charAt(index) == '-')
      {
        index++;
      }
        
      
      while (index < len)
      {
          switch (numString.charAt(index))
          {
              case '0': zeros++;
                break;
              case '2':
              case '4':
              case '6':
              case '8': evens++;
                break;
              case '1':
              case '3':
              case '5':
              case '7':
              case '9': odds++;
                break;
          }
          index++;
      }
      
      System.out.println("Number of odd numbers: "+odds);
      System.out.println("Number of even numbers: "+evens);
      System.out.println("Number of zeros: "+zeros);
    }
}
