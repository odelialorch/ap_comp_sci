
/**
 * Tests how many box cars are rolled out of 1000 dice rolls.
 * 
 * @author (odelialorch) 
 * @version (11/28/16)
 */
public class BoxCars
{
    public static void main()
    {
        PairOfDice dice = new PairOfDice();
        int boxCars = 0; 
        
        for (int i = 1000; i > 0; i--)
        {
            dice.rollDice();
            if (dice.boxCar())
                boxCars++;
        }
        
        System.out.println("Number of box cars: " + boxCars);
    }
}
