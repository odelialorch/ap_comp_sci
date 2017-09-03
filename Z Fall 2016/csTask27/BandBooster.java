
/**
 * Represents a band booster, who supports a band by selling boxes of candy to raise money.
 * 
 * @author (odelialorch) 
 * @version (11/30/16)
 */
public class BandBooster
{
   private String name;
   private int boxesSold;
   
   // Sets the number of boxes sold to 0 and the booster name according to input.
   public BandBooster(String boosterName)
   {
       name = boosterName;
       boxesSold = 0;
   }
   
   // Returns the name of the booster.
   public String getName()
   {
       return name;
   }
   
   // Takes a number of additional boxes and adds it to the number of boxes sold.
   public void updateSales(int additionalBoxes)
   {
       boxesSold += additionalBoxes;
   }
   
   // Returns a string with the booster's name and total sales.
   public String toString()
   {
       String bandBooster = name + ": " + boxesSold + " boxes";
       return bandBooster;
   }
}
