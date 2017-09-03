
/**
 * Represents a magazine.
 * 
 * @author (odelialorch) 
 * @version (2/27/17)
 */
public class Magazine extends ReadingMaterial
{
    private String title;
    private int issue;
    
    public Magazine(int pages, String t, int i)
    {
        super(pages);
        title = t;
        issue = i;
    }
    
    public String toString()
    {
        String magazine = title + " " + issue + ". " + getNumPages() + " pages.";
        return magazine;
    }
}
