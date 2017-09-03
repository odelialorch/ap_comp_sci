/**
 * Represents a deck of 52 cards.
 * 
 * @author (odelialorch) 
 * @version (1/31/17)
 */
import java.util.Random;
public class DeckOfCards
{
    private Card[] deck;
    private int numCards;
    
    public DeckOfCards()
    {
        String[] values = {"Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Spades", "Clovers", "Diamonds"};
        
        deck = new Card[52];
        numCards = 52;
        int card = 0;
        while (card < deck.length)
        {
            for (int suit = 0; suit < suits.length; suit++)
            {
                for (int num = 2; num <= 10; num++)
                {
                    if (card < deck.length)
                    {
                        deck[card] = new Card(num, suits[suit]);
                        card++;
                    }
                }
                for (int val = 0; val < values.length; val++)
                {
                    if (card < deck.length)
                    {
                        deck[card] = new Card(values[val], suits[suit]);
                        card++;
                    }
                }
            }
        }
    }
    
    /** Shuffle the deck - assuming the deck is full*/
    public void shuffle()
    {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--)
        {
            int index = random.nextInt(i + 1);
            Card temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }
    
    /** (overloaded) Shuffle the deck - assuming the deck is not full */
    public void shuffle(int size)
    {
        Random random = new Random();
        for (int i = size - 1; i > 0; i--)
        {
            int index = random.nextInt(i + 1);
            Card temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }
    
    /** Deal a card from the deck */
    public Card deal()
    {
        Card dealt = deck[numCards - 1];
        deck[numCards - 1] = null;
        numCards -= 1;
        return dealt;
    }
    
    /** Return the number of cards left in the deck */
    public int cardsLeft()
    {
        return numCards;
    }
}
