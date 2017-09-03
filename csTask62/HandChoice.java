
/**
 * Write a description of class HandChoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HandChoice
{
    private String choice;
    private String[] choices;
    private String[] predators;
    private String[] prey;
    
    public HandChoice(String str)
    {
        choice = str;
        
        choices = new String[] {"Scissors", "Paper", "Rock", "Lizard", "Spock"};
        int index=0;
        for (int i = 0; i < choices.length; i++)
            if (choice.equalsIgnoreCase(choices[i]))
                index = i;
        
        predators = new String[] {choices[(index+2)%5], choices[(index+4)%5]};
        prey = new String[] {choices[(index+1)%5], choices[(index+3)%5]};
    }
    
    public HandChoice()
    {
        choices = new String[] {"Scissors", "Paper", "Rock", "Lizard", "Spock"};
        
        int index = (int) (Math.random() * 5);
        choice = choices[index];
       
        predators = new String[] {choices[(index+2)%5], choices[(index+4)%5]};
        prey = new String[] {choices[(index+1)%5], choices[(index+3)%5]};
    }
    
    public String getChoice()
    {
        return choice;
    }
    
    public int compareTo(HandChoice hand)
    {
        boolean isPredator = false;
        boolean isPrey = false;
        for (String p: predators)
        {
            if (p.equalsIgnoreCase(hand.choice))
                isPredator = true;
        }
        for (String p: prey)
        {
            if (p.equalsIgnoreCase(hand.choice))
                isPrey = true;
        }
        
        if (choice.equalsIgnoreCase(hand.choice))
            return 0;
        else if (isPredator)
            return -1;
        else 
            return 1;
    }
}
