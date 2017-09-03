
/**
 * Write a description of class DieRolls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DieRolls
{
   private int[] rolls;
   
   public DieRolls()
   {
       rolls = new int[20];
       for (int i = 0; i < rolls.length; i++)
       {
           rolls[i] = (int) (Math.random()*6) + 1;
       }
   }
   
   public void print()
   {
       for (int i = 0; i < rolls.length; i++)
            System.out.print(rolls[i] + " ");
   }
   
   public void printRuns()
   {
       boolean inRun = false;
       for (int i = 0; i < rolls.length; i++)
       {
           if (i != 0 && rolls[i] != rolls[i-1] && inRun)
           {
                System.out.print(") ");
                inRun = false;
           }
           else if (i != rolls.length - 1 && rolls[i] == rolls[i+1] && !inRun)
           {
               System.out.print("( ");
               inRun = true;
           }
           System.out.print(rolls[i] + " ");
       }
       if (inRun)
            System.out.print(")");
   }
   
   public void printMaxRuns()
   {
       boolean inRun = false;
       int start = 0;
       int end = 0;
       int len = 0;
       int maxStart = 0;
       int maxEnd = 0;
       int maxLen = 0;
       
       for (int i = 0; i < rolls.length; i++)
       {
           if (i != rolls.length - 1 && rolls[i] == rolls[i+1] && !inRun)
           {
               len++;
               inRun = true;
               start = i;
           }
           else if (i != 0 && rolls[i] == rolls[i-1] && inRun)
                len++;
           else if (i != 0 && rolls[i] != rolls[i-1] && inRun)
           {
                end = i; 
                if (len > maxLen)
                {
                    maxLen = len;
                    maxStart = start;
                    maxEnd = end;
                }
                len = 0;
                inRun = false;
           }
       }
       for (int i = 0; i < maxStart; i++)
           System.out.print(rolls[i] + " ");
       System.out.print("( ");
       for (int i = maxStart; i < maxEnd; i++)
           System.out.print(rolls[i] + " ");
       System.out.print(") ");
       for (int i = maxEnd; i < rolls.length; i++)
           System.out.print(rolls[i] + " ");
   }
}
