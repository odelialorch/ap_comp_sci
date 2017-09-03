
/**
 * Write a description of class Play here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Play
{
    public static void main()
    {
        HandChoice user;
        RPSLS game;
        String cont = "y";
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Welcome to Rock-Paper-Scissors-Lizard-Spock!");
    
        while(cont.equals("y"))
        {
            System.out.println("\n--------------------------------------------------------");
            System.out.print("\nEnter your choice: ");
            user = new HandChoice(scan.next());
            game = new RPSLS(user);
            
            System.out.println(game);
            
            System.out.print("\nWould you like to play again? (y or n): ");
            cont = scan.next();
        }
        
        System.out.println("\n--------------------------------------------------------");
        System.out.println("\nFinal Results:" + RPSLS.results());
    }
}
