
/**
 * Tests the transfer method of the Account class.
 */
import java.util.Scanner;
public class TransferTest
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        Account acct1 = new Account(200.0, "Person 1");
        Account acct2 = new Account(200.0, "Person 2");
        String answer;
        String keepGoing = "y";
        double transfer;
        
        System.out.println("The following accounts are available:\n\nAccount 1");
        acct1.printSummary();
        System.out.println("\nAccount 2");
        acct2.printSummary();
        
        while (keepGoing.equals("y") || keepGoing.equals("Y"))
        {
            System.out.println("\nWould you like to: \na. Transfer from Account 1 to Account 2 \nb. Transfer from Account 2 to Account 1 \nc. quit");
            answer = scan.next();
            if (answer.equals("a") || answer.equals("A"))
            {
                System.out.println("\nWhat amount would you like to transfer?");
                transfer = scan.nextDouble();
                Account.transfer(acct1, acct2, transfer);
                System.out.println("\nAfter transfer:\n\nAccount 1");
                acct1.printSummary();
                System.out.println("\nAccount 2");
                acct2.printSummary();
            }
            else if (answer.equals("b") || answer.equals("B"))
            {
                System.out.println("\nWhat amount would you like to transfer?");
                transfer = scan.nextDouble();
                Account.transfer(acct2, acct1, transfer);
                System.out.println("\nAfter transfer:\n\nAccount 1");
                acct1.printSummary();
                System.out.println("\nAccount 2");
                acct2.printSummary();
            }
            else if (answer.equals("c") || answer.equals("C"))
            {
                keepGoing = "n";
            }
        }
    }
}
