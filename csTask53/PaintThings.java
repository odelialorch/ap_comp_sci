/**
 * PaintThings.java computes the amount of paint needed to paint various
 * things. Uses the amount method of the paint class which
 * takes any Shape as a parameter.
 * 
 * @author Lewis/Loftus modified by DJC
 * @version 3/16/2016 
 */
import java.text.DecimalFormat;
public class PaintThings
{
    /**
     * Creates some shapes and a Paint object and prints
     * the amount of paint needed to paint each shape.
     */
    public static void main (String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck = new Rectangle(35, 20);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        double deckAmt, ballAmt, tankAmt;
        // Instantiate the three shapes to paint
        deckAmt = deck.area();
        ballAmt = bigBall.area();
        tankAmt = tank.area();
        // Compute the amount of paint needed for each shape
        // Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck " + fmt.format(deckAmt));
        System.out.println ("Big Ball " + fmt.format(ballAmt));
        System.out.println ("Tank " + fmt.format(tankAmt));
    }
}