
/**
 * Represents a monetary coin.
 * 
 * @author (odelialorch) 
 * @version (2/27/17)
 */
public class MonetaryCoin extends Coin
{
    private int value;
    
    public MonetaryCoin()
    {
        super();
        value = 0;
    }
    
    public MonetaryCoin(int num)
    {
        super();
        value = num;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String toString()
    {
        String faceName;
        String coin;
        if (getFace() == 0)
            faceName = "Heads";
        else
            faceName = "Tails";
        coin = "Value: " + value + "\tFace: " + faceName;
        return coin;
    }
}
