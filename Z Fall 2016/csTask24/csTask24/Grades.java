
/**
 * Use Student class to get test grades for two students
 * and compute averages
 * 
 * @author (LLC) 
 * @version (10/30/2014)
 */

public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        //create student2, "Mike"
        Student student2 = new Student("Mike");
        //input grades for Mary
        student1.inputGrades();
        
        System.out.println("Student 1: " + student1);
        
        //print average for Mary
        System.out.println("The average for " + student1.getName()+ "is "
                            + student1.getAverage());
        //input grades for Mike
        student2.inputGrades();
        
        System.out.println("Student 2: " + student2);
        
        //print average for Mike
        System.out.println("The average for " + student2.getName()+ " is "
                            + student2.getAverage());
    }
}