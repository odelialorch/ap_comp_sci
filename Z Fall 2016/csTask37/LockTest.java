
/**
 * Write a description of class LockTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LockTest
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        int r1, l2, r3;
        String cont = "y";
        System.out.print("Enter the first number of your combination: ");
        r1 = scan.nextInt();
        System.out.print("Enter the second: ");
        l2 = scan.nextInt();
        System.out.print("Enter the third: ");
        r3 = scan.nextInt();
        ComboLock lock = new ComboLock(r1, l2, r3);
        
        while (cont.equalsIgnoreCase("y"))
        {
            String direction;
            int ticks;
            System.out.print("\nEnter the direction you would like to turn (l or r): ");
            direction = scan.next();
            System.out.print("Enter the number of ticks you would like to turn: ");
            ticks = scan.nextInt();
            if (direction.equalsIgnoreCase("r"))
            {
                lock.turnRight(ticks);
            }
            else if (direction.equalsIgnoreCase("l"))
            {
                lock.turnLeft(ticks);
            }
            
            System.out.print("\nWould you like to reset your lock's dial? (y or n): ");
            String reset = scan.next();
            if (reset.equalsIgnoreCase("y"))
                lock.reset();
            System.out.print("\nWould you like to keep turning? (y or n): ");
            cont = scan.next();
        }
        
        if (lock.open())
            System.out.println("\nCongratulations! You opened your lock!");
        else 
            System.out.println("\nSorry, you did not open your lock.");
        lock.reset();
    }
}
