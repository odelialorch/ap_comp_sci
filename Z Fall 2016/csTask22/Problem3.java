
/**
 * Write a description of class Problem3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Problem3
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        Scanner wordScan;
        int vowels, consonants;
        
        System.out.println("Enter a sentence or phrase: ");
        String sentence = scan.nextLine();
        wordScan = new Scanner(sentence);
        wordScan.useDelimiter(" ");
        
        vowels = 0;
        consonants = 0;
        
        while (wordScan.hasNext())
        {
            String word = wordScan.next();
            switch (word.charAt(0))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': vowels++;
                    break;
                default: consonants++;
            }
        }
        
        System.out.println("Number of words that begin with a vowel: " + vowels);
        System.out.println("Number of words that begin with a consonant: " + consonants);
    }
}
