/**
 * Sales.java
 * Reads in and stores sales for each of 5 salespeople. Displays
 * sales entered by salesperson ID and total sales for all salespeople.
 * 
 * @author LLC
 * @version 01/05/2015
 */ 

import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;          // Number of salespeople is 5
        int[] sales = new int[SALESPEOPLE]; // Create an array of length 5
        int sum;                            // Total sales for all salespeople
        
        Scanner scan = new Scanner(System.in);
        
        /*
         * Read in and store sales for each of 5 salespeople.
         */
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        
        /*
         * Printout ID and sales for each salesperson and total sales 
         * for all salespeople
         */
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;        
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }        
        System.out.println("\nTotal sales: " + sum);
    }
}