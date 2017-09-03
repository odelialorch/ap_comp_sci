
/**
 * Tests the consolidate method of the Account class.
 */
import java.util.Scanner;
public class TestAccounts2
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the name for Account 1:");
        String name1 = scan.nextLine();
        Account acct1 = new Account(100.0, name1, 1);
        
        System.out.println("Enter the name for Account 2:");
        String name2 = scan.nextLine();
        Account acct2 = new Account(100.0, name2, 2);
        
        System.out.println("Enter the name for Account 3:");
        String name3 = scan.nextLine();
        Account acct3 = new Account(100.0, name3, 3);
        
        System.out.println("\n" + acct1);
        System.out.println("\n" + acct2);
        System.out.println("\n" + acct3);
        
        acct1.close();
        Account newAcct = Account.consolidate(acct2, acct3);
        
        System.out.println("\nAfter changes:");
        System.out.println("\n" + acct1);
        System.out.println("\n" + acct2);
        System.out.println("\n" + acct3);
        System.out.println("\n" + newAcct);
    }
}
