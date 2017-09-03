
/**
 * Represents a pair of dice.
 * 
 * @author (odelialorch) 
 * @version (11/28/16)
 */
import java.util.Random;
public class PairOfDice
{
   Random generator = new Random();
   private Die die1, die2;
   
   public PairOfDice()
   {
       die1 = new Die(6);
       die2 = new Die(6);
   }
   
   public int rollDice()
   {
       die1.roll();
       die2.roll();
       return die1.getFaceValue() + die2.getFaceValue();
   }
   
   public int getDice()
   {
       return die1.getFaceValue() + die2.getFaceValue();
   }
   
   public int getDie1()
   {
       return die1.getFaceValue();
   }
   
   public int getDie2()
   {
       return die2.getFaceValue();
   }
   
   public boolean isDouble()
   {
       return (die1.getFaceValue() == die2.getFaceValue());
   }
   
   public boolean boxCar()
   {
       return (die1.getFaceValue() == 6 && isDouble());
   }
}
