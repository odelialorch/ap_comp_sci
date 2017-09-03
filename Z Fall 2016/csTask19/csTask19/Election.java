
/**
 * This file contains a program that tallies the results of
 * an election. It reads in the number of votes for each of
 * two candidates in each of several precincts. It determines
 * the total number of votes received by each candidate, the
 * percent of votes received by each candidate, the number of
 * precincts each candidate carries, and the
 * maximum winning margin in a precinct.
 * 
 * @author (LLC modified by DCoulombe) 
 * @version (10/20/2014)
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Election
{
    public static void main (String[] args)
    {
        int votesForPolly; // number of votes for Polly in each precinct
        int votesForBill; // number of votes for Bill in each precinct
        int totalPolly; // running total of votes for Polly
        int totalBill; // running total of votes for Bill
        int winsPolly, winsBill, ties;
        String percentPolly, percentBill;
        String response; // answer (y or n) to the "more precincts" question
        Scanner scan = new Scanner(System.in);
        System.out.println ();
        System.out.println ("Election Day Vote Counting Program");
        System.out.println ();
        // Initializations
        votesForPolly = 0;
        votesForBill = 0;
        totalPolly = 0;
        totalBill = 0;
        winsPolly = 0;
        winsBill = 0;
        ties = 0;
        // Loop to "process" the votes in each precinct
        System.out.println("Enter the number of votes for Polly Tichen in this precinct:");
        votesForPolly = scan.nextInt();
        System.out.println("Enter the number of votes for Bill Rider in this precinct:");
        votesForBill = scan.nextInt();
        totalPolly = totalPolly + votesForPolly;
        totalBill = totalBill + votesForBill;
        if (votesForPolly > votesForBill)
            winsPolly++;
        if (votesForPolly < votesForBill)
            winsBill++;
        if (votesForPolly == votesForBill)
            ties++;
        System.out.println("Are there more precincts to report? Answer 'y' or 'n':");
        response = scan.next();
        while (response.equals("y"))
        {
          System.out.println("Enter the number of votes for Polly Tichen in this precinct:");
          votesForPolly = scan.nextInt();
          System.out.println("Enter the number of votes for Bill Rider in this precinct:");
          votesForBill = scan.nextInt();
          totalPolly = totalPolly + votesForPolly;
          totalBill = totalBill + votesForBill;
          if (votesForPolly > votesForBill)
            winsPolly++;
          if (votesForPolly < votesForBill)
            winsBill++;
          if (votesForPolly == votesForBill)
            ties++;
          System.out.println("Are there more precincts to report? Answer 'y' or 'n':");
          response = scan.next();  
        }
        if (response.equals("n"))
        {
            NumberFormat percent = NumberFormat.getPercentInstance();
            double percPolly = (double) totalPolly / (totalPolly+totalBill); 
            percentPolly = percent.format(percPolly);
            double percBill = (double) totalBill / (totalPolly+totalBill);
            percentBill = percent.format(percBill);
            // Print out the results
            System.out.println("FINAL TALLY:");
            System.out.println("Polly Tichen:");
            System.out.println("    "+totalPolly+" total votes");
            System.out.println("    "+percentPolly+" of all votes");
            System.out.println("    "+winsPolly+" precinct/s carried");
            System.out.println("Bill Rider:");
            System.out.println("    "+totalBill+" total votes");
            System.out.println("    "+percentBill+" of all votes");
            System.out.println("    "+winsBill+" precinct/s carried");
            System.out.println(ties+" precinct/s tied");
        }
    }
}

