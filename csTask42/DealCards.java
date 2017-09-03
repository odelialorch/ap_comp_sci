
/**
 * Deals each card from a shuffled deck and prints each card as it is dealt.
 * 
 * @author (odelialorch) 
 * @version (1/31/17)
 */
public class DealCards
{
    public static void main()
    {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        for (int i = 0; i < deck.cardsLeft(); i++)
        {
            Card card = deck.deal();
            System.out.println(card);
        }
    }
}
