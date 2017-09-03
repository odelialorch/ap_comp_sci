/**
 * A bank account class with methods to deposit to, withdraw from,
 * change the name on, and get a String representation
 * of the account.
 */
import java.util.Random;
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private Random generator;
    private static int numAccounts = 0;
    private static int numDeposits = 0;
    private static int amountDeposited = 0;
    private static int numWithdrawals = 0;
    private static int amountWithdrawn = 0;

    /**
     * Constructor -- initializes balance, owner, and account number
     */
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    }
    
    /**
     * Overloaded constructor -- initializes balance and owner, 
     * randomly generates account number.
     */
    public Account(double initBal, String owner)
    {
        generator = new Random();
        balance = initBal;
        name = owner;
        acctNum = generator.nextLong();
        numAccounts++;
    }
    
    /**
     * Overloaded constructor -- initializes owner, 
     * randomly generates account number, sets balance to 0.
     */
    public Account(String owner)
    {
        generator = new Random();
        balance = 0.0;
        name = owner;
        acctNum = generator.nextLong();
        numAccounts++;
    }
    
    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     */
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            numWithdrawals++;
            amountWithdrawn += amount;
        }
        else
            System.out.println("Insufficient funds");
    }
    
    /**
     * Overloaded withdraw method -- checks to see if balance is 
     * sufficient for withdrawal and fee. If so, decrements balance 
     * by amount and fee; if not, prints message. 
     */
    public void withdraw(double amount, double fee)
    {
        if (balance >= (amount + fee))
        {
            balance -= (amount + fee);
            numWithdrawals++;
            amountWithdrawn += amount;
        }
        else
            System.out.println("Insufficient funds");
    }
    
    /**
     * Adds deposit amount to balance.
     */
    public void deposit(double amount)
    {
        balance += amount;
        numDeposits++;
        amountDeposited += amount;
    }

    /**
     * Transfers amount from one account to another. Transfer goes to the
     * account in the parameters.
     */
    public void transfer(Account acct, double amount)
    {
        balance -= amount;
        acct.balance += amount;
    }

    /**
     * Static overloaded transfer method. Transfers amount from one account 
     * to another. Transfer goes to the account in the parameters.
     */
    public static void transfer(Account acct1, Account acct2, double amount)
    {
        acct1.balance -= amount;
        acct2.balance += amount;
    }
    
    /**
     * Returns balance.
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Returns account number.
     */
    public double getAcctNumber()
    {
        return acctNum;
    }

    /**
     * Returns a string containing the name, account
     * number, and balance.
     */
    public String toString()
    {
        return "Name: " + name + "\nAccount Number: " + acctNum +
        "\nBalance: " + balance;
    }
    
    /**
     * Prints a summary of the account.
     */
    public void printSummary()
    {
        System.out.println(this);
    }
    
    /**
     * Closes an account -- appends "CLOSED" to its name and sets
     * balance to 0.
     */
    public void close()
    {
        name += "CLOSED";
        balance = 0;
        numAccounts--;
    }
    
    /**
     * Returns count of accounts made.
     */
    public static int getNumAccounts()
    {
        return numAccounts;
    }
    
    /**
     * Returns count of deposits made per day.
     */
    public static int getNumDeposits()
    {
        return numDeposits;
    }
    
    /**
     * Returns count of withdrawals made per day.
     */
    public static int getNumWithdrawals()
    {
        return numWithdrawals;
    }
    
    /**
     * Returns total amount deposited.
     */
    public static int getAmountDeposited()
    {
        return amountDeposited;
    }
    
    /**
     * Returns total amount deposited.
     */
    public static int getAmountWithdrawn()
    {
        return amountWithdrawn;
    }
    
    /**
     * Resets count of deposits made per day.
     */
    public static void resetNumDeposits()
    {
        numDeposits = 0;
    }
    
    /**
     * Resets count of withdrawals made per day.
     */
    public static void resetNumWithdrawals()
    {
        numWithdrawals = 0;
    }
    
    /**
     * Resets total amount deposited.
     */
    public static void resetAmountDeposited()
    {
        amountDeposited = 0;
    }
    
    /**
     * Resets total amount deposited.
     */
    public static void resetAmountWithdrawn()
    {
        amountWithdrawn = 0;
    }
    
    /**
     * Consolidates accounts of the same owner into one; checks to
     * see that the accounts aren't from different owners or the 
     * same account - if they are, prints message and returns null.
     */
    public static Account consolidate(Account acct1, Account acct2)
    {
        if (!acct1.name.equals(acct2.name))
        {
            System.out.println("These accounts have different owners and cannot be consolidated.");
            return null;
        }
        else if (acct1.acctNum == acct2.acctNum)
        {
            System.out.println("These are the same account and cannot be consolidated.");
            return null;
        }
        else
        {
            Random generator = new Random();
            long num = generator.nextLong();
            double bal = acct1.balance + acct2.balance;
            Account newAcct = new Account(bal, acct1.name, num);
            acct1.close();
            acct2.close();
            return newAcct;
        }
    }
}
