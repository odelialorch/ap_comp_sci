/**
 * Tests ReadingMaterial's extensions.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReadingTester
{
    public static void main()
    {
        Book boc = new Book(302, "Kurt Vonnegut", "Breakfast of Champions", "Novel");
        Magazine ny = new Magazine(92, "The New Yorker", 49);
        Journal jon = new Journal(86, "Journal of Neuroscience", 31);
        Comic ta = new Comic(20, "The Avengers", "Marvel", 3);
        Newspaper nyt = new Newspaper(26, "The New York Times", 913487);
        
        System.out.println(boc + "\n" + ny + "\n" + jon + "\n" + ta + "\n" + nyt);
    }
}
