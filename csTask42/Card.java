
/**
 * Represents a playing card in a standard deck.
 * 
 * @author (odelialorch) 
 * @version (1/31/17)
 */
public class Card
{
    private int val;
    private String suit;
    
    public Card(int num, String type)
    {
        val = num;
        suit = type;
    }
    
    public Card (String value, String type)
    {
        if (value.equalsIgnoreCase("Jack"))
            val = 11;
        else if (value.equalsIgnoreCase("Queen"))
            val = 12;
        else if (value.equalsIgnoreCase("King"))
            val = 13;
        else if (value.equalsIgnoreCase("Ace"))
            val = 1;
    }
    
    public String toString()
    {
        if (val <= 10 && val > 1)
            return val + " of " + suit;
        else if (val == 11)
            return "Jack of " + suit;
        else if (val == 12)
            return "Queen of " + suit;
        else if (val == 13)
            return "King of " + suit;
        else 
            return "Ace of " + suit;
    }
}
