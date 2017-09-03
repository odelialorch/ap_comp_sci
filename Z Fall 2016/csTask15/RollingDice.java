
/**
 * Simulates the rolling of dice.
 * 
 * @odelialorch
 * @10/13/16
 */
public class RollingDice
{
    public static void main()
    {
        int die1, die2, dice;
        die1 = (int) (Math.random()*6)+1;
        die2 = (int) (Math.random()*6)+1;
        dice = die1 + die2;
        
        System.out.println("The first die rolls: "+die1);
        System.out.println("The second die rolls: "+die2);
        System.out.println("Together, the dice roll: "+dice);
    }
}
        