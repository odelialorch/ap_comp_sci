/** 
 * Represents a single magazine.
 * 
 * @author LLC (modified by DJC)
 * @version 6/5/2017
 */

public class Magazine implements Comparable
{
   private String title;
   /** Sets up the new magazine with its title. */
   public Magazine (String newTitle)
   {
      title = newTitle;
   }
   
   /** Returns this magazine as a string. */
   public String toString ()
   {
      return title;
   }
   
   public int compareTo(Object obj)
   {
       return title.compareTo(obj.toString());
   }
}