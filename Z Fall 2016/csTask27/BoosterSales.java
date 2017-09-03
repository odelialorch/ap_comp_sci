/**
 * Tracks the sales of two band boosters over three weeks.
 * 
 * @author (odelialorch) 
 * @version (11/30/16)
 */
import java.util.Scanner;
public class BoosterSales
{
   public static void main()
   {
       Scanner scan = new Scanner(System.in);
       
       // Instantiates two band boosters.
       System.out.println("Enter the name of a band booster: ");
       BandBooster booster1 = new BandBooster(scan.next());
       
       System.out.println("Enter the name of a second band booster: ");
       BandBooster booster2 = new BandBooster(scan.next());
       
       // Prompts for the sales of the week and updates the total sales, repeating for 3 weeks.
       for (int i = 1; i <= 3; i++)
       {
           System.out.println("Enter the number of boxes sold by " + booster1.getName() + " in week " + i + ":");
           booster1.updateSales(scan.nextInt());
           System.out.println("Enter the number of boxes sold by " + booster2.getName() + " in week " + i + ":");
           booster2.updateSales(scan.nextInt());
       }
       
       // Prints the boosters' names and total sales.
       System.out.println("Total sales:");
       System.out.println(booster1);
       System.out.println(booster2);
   }
}