
/**
 * Represents a player of the game Pig.
 * 
 * @author (odelialorch) 
 * @version (12/12/16)
 */
public class PigPlayer
{
   private PairOfDice dice;
   private int roundPoints;
   private int totalPoints;
    
   public PigPlayer()
   {
       dice = new PairOfDice();
       roundPoints = 0;
       totalPoints = 0;
   }
    
   public int takeTurn()
   {
       roundPoints += dice.rollDice();
       if (dice.getDie1() == 1 || dice.getDie2() == 1)
            roundPoints = 0;
       if (dice.getDice() == 2)
            totalPoints = 0;
       return dice.getDice();
   }

   public int getPlayerDice()
   {
       return dice.getDice();
   }
   
   public int getPlayerDie1()
   {
       return dice.getDie1();
   }
   
   public int getPlayerDie2()
   {
       return dice.getDie2();
   }
   
   public int getRoundPoints()
   {
       return roundPoints;
   }
   
   public int getTotalPoints()
   {
       totalPoints += roundPoints;
       return totalPoints;
   }
   
   public boolean isItMyTurn()
   {
       if (dice.getDie1() == 1 || dice.getDie2() == 1)
            return false;
       else 
            return true;
   }
   
   public boolean goAgain(String yesOrNo)
   {
       if (yesOrNo.equalsIgnoreCase("y"))
       {
            return true;
       }
       else if (yesOrNo.equalsIgnoreCase("n"))
            return false;
       return true;
   }
   
   public boolean isWinner()
   {
       if (totalPoints >= 100)
            return true;
       else
            return false;
   }
   
   public void newRound()
   {
       roundPoints = 0;
   }
}
