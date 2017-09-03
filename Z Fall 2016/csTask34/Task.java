
/**
 * Represents a task by implementing the Priority interface.
 * 
 * @author (odelialorch) 
 * @version (1/3/17)
 */
public class Task implements Priority
{
    String type;
    int priority;
    
    public Task(String task, int rank)
    {
        type = task;
        priority = rank;
    }
    
    public int setPriority(int rank)
    {
        priority = rank;
        return priority;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public String getType()
    {
        return type;
    }
}
