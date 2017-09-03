
/**
 * Stores and manipulates a person's first, middle, and last names.
 * 
 * @author (odelialorch) 
 * @version (11/30/16)
 */
public class Name
{
    private String first;
    private String middle;
    private String last;
    
    // Sets the person's first, middle, and last names according to input
    public Name(String firstName, String middleName, String lastName)
    {
        first = firstName;
        middle = middleName;
        last = lastName;
    }
    
    // Returns the person's first name.
    public String getFirst()
    {
        return first;
    }
    
    // Returns the person's middle name.
    public String getMiddle()
    {
        return middle;
    }
    
    // Returns the person's last name.
    public String getLast()
    {
        return last;
    }
    
    // Returns the person's full name.
    public String firstMiddleLast()
    {
        String name = first + " " + middle + " " + last;
        return name;
    }
    
    // Returns the person's full name in "Last, First Middle" format. 
    public String lastFirstMiddle()
    {
        String name = last + ", " + first + " " + middle;
        return name;
    }
    
    // Tests to see if this person's name is the same as another person's name, ignoring case.
    public boolean equals(Name otherName)
    {
        return firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast());
    }
    
    // Returns the initials of the person.
    public String initials()
    {
        String initials = first.substring(0,1).toUpperCase() + "." 
                            + middle.substring(0,1).toUpperCase() + "."
                            + last.substring(0,1).toUpperCase() + ".";
        return initials;
    }
    
    // Returns the length of the person's full name, ignoring spaces.
    public int length()
    {
        int length = first.length() + middle.length() + last.length();
        return length;
    }
}
