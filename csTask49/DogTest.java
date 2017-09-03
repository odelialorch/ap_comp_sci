/**
 * A simple driver class that creates a Dog and makes it speak.
 * 
 * @author LLC
 * @version 02/22/2015
 */

public class DogTest
{
    public static void main(String[] args)
    {
        Yorkshire york1 = new Yorkshire("Sparky");
        System.out.println(york1.getName() + " says " + york1.speak());
        Labrador lab1 = new Labrador("Fido", "Brown");
        System.out.println(lab1.getName() + " says " + lab1.speak());
        
        System.out.println("Yorkshire average breed weight: " + york1.avgBreedWeight());
        System.out.println("Labrador average breed weight: " + lab1.avgBreedWeight());
    }
}

