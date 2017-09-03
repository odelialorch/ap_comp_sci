/**
 * Represents a newspaper.
 * 
 * @author (odelialorch) 
 * @version (2/27/17)
 */
public class Newspaper extends ReadingMaterial
{
    private String title;
    private int issue;
    
    public Newspaper(int pages, String t, int i)
    {
        super(pages);
        title = t;
        issue = i;
    }
    
    public String toString()
    {
        String news = title + " " + issue + ". " + getNumPages() + " pages.";
        return news;
    }
}
