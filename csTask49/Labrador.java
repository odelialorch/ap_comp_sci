/**
 * A class derived from Dog that holds information about
 * a labrador retriever. Overrides Dog speak method and includes
 * information about avg weight for this breed.
 * 
 * @author LLC
 * @version 02/22/2015
 */
public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    private static int breedWeight = 75;
    
    /**
     * @param name and color
     */
    public Labrador(String nameIn, String colorIn)
    {
        super(nameIn);
        color = colorIn;
    }

    /**
     * Big bark -- overrides speak method in Dog
     * @return something a big Dog might say
     */
    public String speak()
    {
        return "WOOF";
    }

    /**
     * @return weight of Dog 
     */
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}