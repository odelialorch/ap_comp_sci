/** 
 * Represents a collection of magazines.
 * 
 * @author LLC (modified by DJC)
 * @version 6/5/2017
 */
public class MagazineList
{
    private ListNode list;

    /** Sets up an empty list of magazines. */
    public MagazineList()
    {
        list = null;
    }

    /** Creates a new ListNode object and adds it to the end of the linked list.*/  
    public void add (Magazine mag)
    {
        ListNode node = new ListNode (mag, null);
        ListNode current;
        if (list == null)
            list = node;
        else
        {
            current = list;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(node);
        }
    }
    
    /** Deletes a ListNode object from the linked list.*/  
    public boolean delete (Magazine mag)
    {
        boolean exists = false;
        ListNode previous;
        ListNode current;
        if (list == null)
            exists = false;
        else
        {
            current = list;
            while (current.getNext() != null)
            {    
                previous = current;
                current = current.getNext();
                if (((Magazine)current.getValue()).compareTo(mag) == 0) 
                {
                    exists = true;
                    previous.setNext(current.getNext());
                } 
            }
        }
        return exists;
    }
    
    /** Inserts a ListNode object into the linked list.*/  
    public void insert (Magazine mag)
    {
        ListNode node = new ListNode (mag, null);
        ListNode current;
        if (list == null)
            list = node;
        else if (((Magazine)list.getValue()).compareTo(mag) > 0)
        {
            node.setNext(list);
            list = node;
        }
        else
        {
            current = list;
            while (current.getNext() != null && ((Magazine)current.getNext().getValue()).compareTo(mag) < 0)
            {    
                current = current.getNext();
            }
            ListNode temp = current.getNext();
            current.setNext(node);
            node.setNext(temp);
        }
    }

    /** Returns this list of magazines as a string. */
    public String toString ()
    {
        String result = "";
        ListNode current = list;
        while (current != null)
        {
            result += current.getValue().toString() + "\n";
            current = current.getNext();
        }
        return result;
    }
}