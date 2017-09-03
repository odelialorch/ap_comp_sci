
/**
 * Define a student class that stores name, score on test 1, and
 * score on test 2. Methods prompt for and read in grades,
 * compute the average, and return a string containing student’s info.
 * 
 * @author (LLC) 
 * @version (10/30/2014)
 */

import java.util.Scanner;

public class Student
{
    //declare instance data
    private String name;
    private int test1Score;
    private int test2Score;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        name = studentName;
    }
    
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter " + name + "'s score for test #1: ");
        test1Score = scan.nextInt();
        System.out.print("Enter " + name + "'s score for test #2: ");
        test2Score = scan.nextInt();
    }
    
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage()
    {
        //add body of getAverage
        double average = ((double) test1Score + test2Score)/2;
        return average;
    }
    
    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public String getName()
    {
        //add body of printName
        return name;
    }
    
    public String toString()
    {
       String str = "Name: " + name + " Test 1: " + test1Score + " Test 2: "+ test2Score;
       return str;
    }
}