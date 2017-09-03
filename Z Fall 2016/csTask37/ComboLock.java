
/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
   private int r1, l2, r3, dial; 
   private String rlr = "";
   private final int MAX_NUM = 40;
   
   // precondition: no two numbers can be the same.
   public ComboLock(int num1, int num2, int num3)
   {
       r1 = num1 + 1;
       l2 = num2 + 1;
       r3 = num3 + 1;
       dial = 1;
   }
   
   public void reset()
   {
       dial = 1;
   }
   
   public void turnLeft(int ticks)
   {
       dial += ticks;
       dial = dial % MAX_NUM;
       if (dial == l2)
            rlr += "l2";
   }
   
   public void turnRight(int ticks)
   {
       if (ticks >= dial)
       {
           int temp = (ticks - dial) % MAX_NUM;
           dial = 40 - temp;
       }
       else 
       {
           dial -= ticks;
       }
       if (dial == r1)
            rlr += "r1";
       else if (dial == r3)
            rlr += "r3";
   }
   
   public boolean open()
   {
       if (rlr.contains("r1l2r3"))
            return true;
       else
            return false;
   }
}
