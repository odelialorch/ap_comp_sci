
/**
 * Write a description of class SortedIntList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortedIntList extends IntList
{
    public SortedIntList(int size)
    {
        super(size);
    }
    
    /** 
     * Adds an integer to the list. If the list is full,
     * prints a message and does nothing.
     */
    public void add(int value)
    {
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else if (numElements == 0)
        {
            list[0] = value;
            numElements++;
        }
        else
        {
            int index = 0;
            for (int i = 0; i < numElements; i++)
                if (value > list[i])
                    index = i+1;
            if (index != numElements)
            {
                for (int j = numElements-1; j >= index; j--)
                    list[j+1] = list[j];
            }
            list[index] = value;
            numElements++;
        }
    }
}
