
/**
 * Plays a game of Pig with the computer.
 * 
 * @author (odelialorch) 
 * @version (12/12/16)
 */
import java.util.*;
public class Pig
{
   public static void main()
   {
       PigPlayer human = new PigPlayer();
       PigPlayer comp = new PigPlayer();
       Scanner scan = new Scanner(System.in);
       Random generator = new Random();
       
       // introduction
       System.out.println("************************* Welcome to the Game of Pig *************************");
       System.out.println("\n     Rules: You roll a pair of dice until you choose to end your turn or are");
       System.out.println("     forced to, and the dice are then given to the other player (in this");
       System.out.println("     case, the computer). Your points from that round are then added up and");
       System.out.println("     added to your total score.");
       System.out.println("     If you roll a 1, your points from that round become 0 and your turn is");
       System.out.println("     over.");
       System.out.println("     If you roll two 1s, your points from that round and your total points");
       System.out.println("     become 0, and your turn is over.");
       System.out.println("     The more turns you roll, the greater risk you have to lose points.");
       System.out.println("     The first player to reach 100 total points wins the game.");
       System.out.println("     Good luck!");
                                                                                                                          
       // human goes first
       System.out.println("\n******************************** Your Turn *********************************");
       human.newRound();
       System.out.print("\nIt is your turn. Would you like to roll (y or n)? ");
       String yesOrNo = scan.next();
       while (human.goAgain(yesOrNo))
       {
           System.out.println("\n\tYou rolled: " + human.takeTurn() + " = " + human.getPlayerDie1() + " + " + human.getPlayerDie2());;
           System.out.println("\tRound total: " + human.getRoundPoints());
           if (human.isItMyTurn())
           {
                System.out.print("\nWould you like to roll again (y or n)? ");
                yesOrNo = scan.next();
           }
           else if (human.getPlayerDice() == 2)
           {
                System.out.println("\nOh no! You rolled two 1s! Your turn is over.");
                yesOrNo = "n";
           }
           else
           {
                System.out.println("\nOh no! You rolled a 1! Your turn is over.");
                yesOrNo = "n";
           }
       }
       System.out.println("\nRound points: " + human.getRoundPoints());
       System.out.println("Total points: " + human.getTotalPoints());
       
       while (!human.isWinner() && !comp.isWinner())
       {
            // computer goes next 
            System.out.println("\n***************************** Computer's Turn ******************************");
            comp.newRound();
            System.out.print("\nWould you like to roll (y or n)? ");
            int num = 0;
            if (num == 0)
                yesOrNo = "y";
            else
                yesOrNo = "n";
            System.out.print(yesOrNo);
            while (comp.goAgain(yesOrNo))
            {
                System.out.println("\n\tYou rolled: " + comp.takeTurn() + " = " + comp.getPlayerDie1() + " + " + comp.getPlayerDie2());;
                System.out.println("\tRound total: " + comp.getRoundPoints());
                if (comp.isItMyTurn())
                {
                    System.out.print("\nWould you like to roll again (y or n)? ");
                    num = generator.nextInt(2);
                    if (num == 0)
                        yesOrNo = "y";
                    else
                        yesOrNo = "n";
                    System.out.print(yesOrNo);
                }
                else if (comp.getPlayerDice() == 2)
                {
                    System.out.println("\nOh no! You rolled two 1s! Your turn is over.");
                    yesOrNo = "n";
                }
                else
                {
                    System.out.println("\nOh no! You rolled a 1! Your turn is over.");
                    yesOrNo = "n";
                }
            }
            System.out.println("\nRound points: " + comp.getRoundPoints());
            System.out.println("Total points: " + comp.getTotalPoints());
            
            if (!comp.isWinner())
            {
                System.out.println("\n******************************** Your Turn *********************************");
                human.newRound();
                System.out.print("\nIt is your turn. Would you like to roll (y or n)? ");
                yesOrNo = scan.next();
                while (human.goAgain(yesOrNo))
                {
                    System.out.println("\n\tYou rolled: " + human.takeTurn() + " = " + human.getPlayerDie1() + " + " + human.getPlayerDie2());;
                    System.out.println("\tRound total: " + human.getRoundPoints());
                    if (human.isItMyTurn())
                    {
                        System.out.print("\nWould you like to roll again (y or n)? ");
                        yesOrNo = scan.next();
                    }
                    else if (human.getPlayerDice() == 2)
                    {
                        System.out.println("\nOh no! You rolled two 1s! Your turn is over.");
                        yesOrNo = "n";
                    }
                    else
                    {
                        System.out.println("\nOh no! You rolled a 1! Your turn is over.");
                        yesOrNo = "n";
                    }
                }
                System.out.println("\nRound points: " + human.getRoundPoints());
                System.out.println("Total points: " + human.getTotalPoints());
            }
       }
       
       if (human.isWinner())
           System.out.println("\n****************** Congratulations! You are the winner! ********************");
       else if (comp.isWinner())
           System.out.println("\n******************** Sorry, you lost this game of Pig. *********************");
   }        
}
