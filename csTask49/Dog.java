/**
 * A class that holds a dog's name and can make it speak.
 * 
 * @author LLC
 * @version 02/22/2015
 * 
 */
public abstract class Dog
{
    private String name;

    /**
     * Stores the name of the Dog
     */
    public Dog(String nameIn)
    {
        name = nameIn;
    }

    /**
     * @return the Dog's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return a string containing something the Dog says
     */
    public String speak()
    {
        return "Woof";
    }
    
    /**
     * @return weight of Dog 
     */
    public abstract int avgBreedWeight();
}
