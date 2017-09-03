/**
 * WriteTest reads in test questions and prints out a formatted test.
 * 
 * @author  
 * @version 
 */

import java.util.Scanner;
import java.io.*;

public class WriteTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner fileScan = new Scanner (new File("testdata.txt"));

        // Read in the number of test questions
        int numQuestions = Integer.parseInt(fileScan.nextLine());
        String type;
               
        // Instantiate the array of TestQuestions of the proper length
        TestQuestion[] list = new TestQuestion[numQuestions];
        
        // Repeat until finished: Read in the type of test question, create a
        //  new TestQuestion of that type, read the rest of the information for
        //  that question into the TestQuestion array.
        for (int i = 0; i < numQuestions; i++)
        {
            type = fileScan.nextLine();

            if (type.equals("e"))
                list[i] = new Essay();
            else
                list[i] = new MultChoice();

            list[i].readQuestion(fileScan);
            System.out.println("\n" + (i+1) + ". " + list[i]);
        }
    }
}
