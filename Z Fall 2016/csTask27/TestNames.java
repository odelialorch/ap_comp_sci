/**
 * Tests the Name class methods with two people's names.
 * 
 * @author (odelialorch) 
 * @version (11/30/16)
 */
import java.util.Scanner;
public class TestNames
{
    public static void main()
    {
        String first1, middle1, last1, first2, middle2, last2;
        Scanner scan = new Scanner(System.in);
        
        // Prompts for Person 1's name, and instantiates it.
        System.out.println("\nEnter the first name of Person 1: ");
        first1 = scan.next();
        System.out.println("Enter the middle name of Person 1: ");
        middle1 = scan.next();
        System.out.println("Enter the last name of Person 1: ");
        last1 = scan.next();
        Name person1 = new Name(first1, middle1, last1);
        
        // Prompts for Person 2's name, and instantiates it.
        System.out.println("\nEnter the first name of Person 2: ");
        first2 = scan.next();
        System.out.println("Enter the middle name of Person 2: ");
        middle2 = scan.next();
        System.out.println("Enter the last name of Person 2: ");
        last2 = scan.next();
        Name person2 = new Name(first2, middle2, last2);
        
        // Prints Person 1's name in first-middle-last and last-first-middle forms, the person's 
        //  initials, and the length of the person's name.
        System.out.println("\nPerson 1:");
        System.out.println("first-middle-last: " + person1.firstMiddleLast()); 
        System.out.println("last-first-middle: " + person1.lastFirstMiddle());
        System.out.println("initials: " + person1.initials());
        System.out.println("length of name: " + person1.length() + " letters");
        
        // Prints Person 2's name in first-middle-last and last-first-middle forms, the person's 
        //  initials, and the length of the person's name.
        System.out.println("\nPerson 2:");
        System.out.println("first-middle-last: " + person2.firstMiddleLast());
        System.out.println("last-first-middle: " + person2.lastFirstMiddle());
        System.out.println("initials: " + person2.initials());
        System.out.println("length of name: " + person2.length() + " letters");
        
        // Tests to see if the names are the same.
        if (person1.equals(person2))
            System.out.println("\nThese names are the same.");
        else
            System.out.println("\nThese names are not the same.");
    }
}
