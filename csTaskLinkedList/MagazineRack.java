/**
 * Driver to exercise the MagazineList collection.
 * 
 * @author LLC (modified by DJC)
 * @version 6/5/2017
 */
public class MagazineRack
{
/** Creates a MagazineList object, adds several magazines to the
 *  list, then prints it.
 */
   public static void main (String[] args)
   {
      MagazineList rack = new MagazineList();
      rack.add (new Magazine("Time"));
      rack.add (new Magazine("Wired"));
      rack.add (new Magazine("Communications of the ACM"));
      rack.add (new Magazine("House and Garden"));
      rack.add (new Magazine("GQ"));
      System.out.println(rack);
      
      System.out.println("\nTesting delete:");
      rack.delete(new Magazine("Time"));
      rack.delete(new Magazine("Communications of the ACM"));
      System.out.println (rack);
      
      System.out.println ("\nTesting insert:");
      MagazineList rack2 = new MagazineList();
      rack2.insert (new Magazine("Time"));
      rack2.insert (new Magazine("Wired"));
      rack2.insert (new Magazine("Communications of the ACM"));
      rack2.insert (new Magazine("House and Garden"));
      rack2.insert (new Magazine("GQ"));
      System.out.println(rack2);
   }
}