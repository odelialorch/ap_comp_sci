
/**
 * Represents a book.
 * 
 * @author (odelialorch) 
 * @version (2/27/17)
 */
public class Book extends ReadingMaterial
{
    private String title;
    private String genre;
    
    public Book(int pages, String authors, String t, String g)
    {
        super(pages, authors);
        title = t;
        genre = g;
    }
    
    public String toString()
    {
        String book = title + " by " + getAuthorsNames() + ". " + genre + ". " + getNumPages() + " pages.";
        return book;
    }
}
