/**
 * Generates a random number from 1 to 10 that the user must guess.
 * 
 * @odelialorch 
 * @10/31/16
 */
// ****************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess; //Number the user tries to guess
        int guess; //The user's guess
        int count = 1;
        int countHigh = 0;
        int countLow = 0;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        //randomly generate the number to guess
        numToGuess = generator.nextInt(10)+1;
        //print message asking user to enter a guess
        System.out.println("Guess the number:");
        //read in guess
        guess = scan.nextInt();
        while (guess != numToGuess) //keep going as long as the guess is wrong
        {
            if (guess > numToGuess)
            {
                //print message saying guess is too high
                System.out.println("You guessed too high! Guess again:");
                countHigh++;
            }
            else 
            {    
                System.out.println("You guessed too low! Guess again:");
                countLow++;
            }
            //get another guess from the user
            guess = scan.nextInt();
            count++;
        }

        //print message saying guess is right
        System.out.println("You guessed the right number! It took you "+count+" guesses: "+countHigh
                            +" too high, "+countLow+" too low, and 1 right guess.");
    }
}