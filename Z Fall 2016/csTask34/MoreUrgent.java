/**
 * Prompts for two tasks and returns the more urgent task
 * 
 * @author (odelialorch) 
 * @version (1/3/17)
 */
import java.util.Scanner;
public class MoreUrgent
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        String name;
        int rank;
        
        System.out.println("Enter two tasks to find out which is more urgent.");
        System.out.print("\nTask 1: \n\tName of the task: ");
        name = scan.next();
        
        System.out.print("\tRank of its importance: ");
        rank = scan.nextInt();
        
        Task task1 = new Task(name, rank);
        
        System.out.print("\nTask 2: \n\tName of the task: ");
        name = scan.next();
        
        System.out.print("\tRank of its importance: ");
        rank = scan.nextInt();
        
        Task task2 = new Task(name, rank);
        
        if (task1.getPriority() < task2.getPriority())
            System.out.println("\n" + task1.getType() + " is more urgent.");
        else if (task2.getPriority() < task1.getPriority())
            System.out.println("\n" + task2.getType() + " is more urgent.");
        else 
            System.out.println("\nThese tasks are equally urgent.");
    }
}
