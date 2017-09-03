/**
 * Represents some reading material.
 * 
 * @author (odelialorch) 
 * @version (2/27/17)
 */
public class ReadingMaterial
{
    private int numPages;
    private String authorsNames;
    
    public ReadingMaterial(int pages, String authors)
    {
        numPages = pages;
        authorsNames = authors;
    }
    
    public ReadingMaterial(int pages)
    {
        numPages = pages;
        authorsNames = "";
    }
    
    public int getNumPages()
    {
        return numPages;
    }
    
    public String getAuthorsNames()
    {
        return authorsNames;
    }
}
