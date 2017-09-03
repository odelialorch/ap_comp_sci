
/**
 * Reads and analyzes a file of baseball statistics.
 * 
 * @author (odelialorch)
 * @version (11/2/16)
 */
import java.util.Scanner;
import java.io.*;

public class BaseballStats
{
    /**
     * Reads urls from a file and prints their path components.
     */
    public static void main (String[] args) throws IOException
    {
        String stats, name, currentData, file;
        int hits, outs, walks, sacrifices;
        double battingAverage;
        Scanner scan, fileScan, statsScan;
        scan = new Scanner(System.in);
        System.out.println("Enter file name:");
        file = scan.nextLine();
        fileScan = new Scanner (new File(file));
        //  Read and process each line of the file
        while (fileScan.hasNext())
        {
            stats = fileScan.nextLine();
            System.out.println ("Stats: " + stats);
            statsScan = new Scanner (stats);
            statsScan.useDelimiter(",");
            //  Print each part of the url
            name = statsScan.next();
            hits = 0; outs = 0; walks = 0; sacrifices = 0;
            while (statsScan.hasNext())
            {    
                currentData = statsScan.next();
                if (currentData.equals("h"))
                    hits++;
                if (currentData.equals("o"))
                    outs++;
                if (currentData.equals("w"))
                    walks++;
                if (currentData.equals("s"))
                    sacrifices++;
            }
            battingAverage = (double) hits / (hits + outs);
            System.out.println("Player: "+name);
            System.out.println("Hits: "+hits);
            System.out.println("Outs: "+outs);
            System.out.println("Walks: "+walks);
            System.out.println("Sacrifices: "+sacrifices);
            System.out.println("Batting Average: "+battingAverage);
            System.out.println();
        }
    }
}