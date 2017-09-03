
/**
 * Prints the song "100 Bottles of Beer."
 * 
 * @author (odelialorch)
 * @version (11/4/16)
 */
public class Beer
{
    public static void main()
    {
        for (int x = 100; x >= 2; x--)
        {
            System.out.println(x + " bottles of beer on the wall");
            System.out.println(x + " bottles of beer");
            System.out.println("If one of those bottles should happen to fall");
            System.out.println((x-1) + " bottles of beer on the wall");
            System.out.println("");
        }
        System.out.println("1 bottle of beer on the wall");
        System.out.println("1 bottle of beer");
        System.out.println("If that bottle should happen to fall");
        System.out.println("No bottles of beer on the wall");
        System.out.println("");
    }
}