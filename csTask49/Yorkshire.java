/**
 * A class derived from Dog that holds information about 
 * a Yorkshire terrier. Overrides Dog speak method.
 * 
 * @author LLC
 * @version 02/22/2015
 */

public class Yorkshire extends Dog
{
    private static int breedWeight = 50;
    
    /**
     * @param name of Dog
     */
    public Yorkshire(String nameIn)
    {
        super(nameIn);
    }

    /**
     * Small bark -- overrides speak method in Dog
     * @return something a small Dog might say
     */
    public String speak()
    {
        return "woof";
    }
    
    /**
     * @return weight of Dog 
     */
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}
