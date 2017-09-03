/**
 * Represents a journal.
 * 
 * @author (odelialorch) 
 * @version (2/27/17)
 */
public class Journal extends ReadingMaterial
{
    private String title;
    private int issue;
    
    public Journal(int pages, String t, int i)
    {
        super(pages);
        title = t;
        issue = i;
    }
    
    public String toString()
    {
        String journal = title + " " + issue + ". " + getNumPages() + " pages.";
        return journal;
    }
}
