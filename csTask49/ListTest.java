/**
 * A simple driver program that creates an IntList, puts some
 * ints in it, and prints the list.
 * 
 * @author LLC
 * @version 02/22/2015
 */
public class ListTest
{
    public static void main(String[] args)
    {
        IntList myList = new IntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        
        System.out.println(myList);
        System.out.println("There are " + myList.getNumElements() 
                            + " elements in this list.");
        
        SortedIntList myListSorted = new SortedIntList(10);
        myListSorted.add(100);
        myListSorted.add(50);
        myListSorted.add(200);
        myListSorted.add(25);
        
        System.out.println(myListSorted);
        System.out.println("There are " + myListSorted.getNumElements() 
                            + " elements in this list.");
    }
}
