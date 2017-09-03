/**
 * Represents a comic.
 * 
 * @author (odelialorch) 
 * @version (2/27/17)
 */
public class Comic extends ReadingMaterial
{
    private String title;
    private String company;
    private int issue;
    
    public Comic(int pages, String t, String c, int i)
    {
        super(pages);
        title = t;
        issue = i;
        company = c;
    }
    
    public String toString()
    {
        String comic = company + "'s " + title + " " + issue + ". " + getNumPages() + " pages.";
        return comic;
    }
}
