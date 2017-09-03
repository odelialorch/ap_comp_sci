/**
 * Tests if a string overlaps (all of its characters appear in) another.
 * 
 * @author (odelialorch) 
 * @version (11/22/16)
 */
import java.util.Scanner;
public class Overlap
{
   public static void main()
   {
       // Declares and initializes variables
       Scanner scan = new Scanner(System.in);
       String s1, s2;
       int overlap = 0; // counter
       
       // Collects the two Strings
       System.out.println("Please enter a word or phrase: ");
       s2 = scan.nextLine();
       System.out.println("Please enter another to check if it overlaps the first: ");
       s1 = scan.nextLine();
       
       // Counts the number of overlapping characters in s1 
       for (int i = 0; i < s1.length(); i++)
       {
           char s1Char = s1.charAt(i);
           int lettersOverlapped = 0;   // counter - local data in this for loop
           for (int j = 0; j < s2.length(); j++)
           {
               if (s2.charAt(j) == s1Char)
               {
                   lettersOverlapped++;
               }
           }
           if (lettersOverlapped > 0) // doesn't matter the value of lettersOverlapped, only matters that it overlapped at least once
                overlap++;
       }
       
       // Checks to see if s1 overlaps s2
       if (overlap == s1.length()) //if all of the characters in s1 overlap (have caused overlap to be incremented) 
            System.out.println("Your second word/phrase overlaps the first!\n");                                                             
       else 
            System.out.println("Sorry, your second word/phrase does not overlap the first.\n");
   }
}

/**
 * SAMPLE OUTPUT
 * 
 * Please enter a word or phrase: 
 * High School for Math, Science, and Engineering
 * Please enter another to check if it overlaps the first:
 * HS MSE
 * Your second word/phrase overlaps the first!
 * 
 * Please enter a word or phrase: 
 * high school for math, science, and engineering
 * Please enter another to check if it overlaps the first:
 * HS MSE
 * Sorry, your second word/phrase does not overlap the first.
 * 
 * Please enter a word or phrase: 
 * HE PROGRAMS
 * Please enter another to check if it overlaps the first:
 * HS MSE
 * Your second word/phrase overlaps the first!
 * 
 * Please enter a word or phrase: 
 * MESH
 * Please enter another to check if it overlaps the first:
 * HS MSE
 * Sorry, your second word/phrase does not overlap the first.
 * 
 */