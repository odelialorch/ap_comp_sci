/**
 * Tests several methods for manipulating String objects.
 * 
 * @odelialorch 
 * @10/13/16
 */
// ***************************************************************
// StringManips.java
//
// Test several methods for manipulating String objects
// ***************************************************************
import java.util.Scanner;

public class StringManips
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String phrase = new String ("This is a String test.");
        int phraseLength; // number of characters in the phrase String
        int middleIndex; // index of the middle character in the String
        String firstHalf; // first half of the phrase String
        String secondHalf; // second half of the phrase String
        String switchedPhrase; // a new phrase with original halves switched
        String middle3; // 1. middle three characters of phrase
        String city, state; // 3. scanner input variables
        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        // 2. switches switchedPhrase blank characters to *s
        switchedPhrase = switchedPhrase.replace(' ', '*');
        // get the substring for the middle three characters of the phrase
        middle3 = phrase.substring((middleIndex-1),(middleIndex+2));
        // print information about the phrase
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
            " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " +
            phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println("Middle three characters: "+middle3);
        System.out.println();
        // asks for city and state of hometown from user
        System.out.println("In which city is your hometown?");
        city = scan.nextLine();
        System.out.println("In which state is your hometown?");
        state = scan.nextLine();
        // prints the city and state in format
        System.out.println(city.toLowerCase()+", "+state.toUpperCase());
    }
}
