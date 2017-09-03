------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: csTask23
VERSION or DATE: 16 November 2016
AUTHORS: Odelia Lorch

MULTIPLE CHOICE:
4.1. b. house is to blueprint. A class is the "blueprint" for creating an object.
4.2. c. the toString method is called on the object to get the string to print.
4.3. d. public methods. 

TRUE OR FALSE:
4.1. True. Declaring them private makes them accessible outside the class and doesn't protect the data in 
        the class.
4.2. False. Methods that don't return (main, constructor) and void methods don't need return statements.
4.3. True.
4.4. False. A variable declared in one method is local data to that method, and does not exist outside of 
        that method.

SHORT ANSWER:
4.1. public double translate(int parameter)
4.3. public void printAnswer(double parameter1, double parameter2, double parameter3)
4.5. 
public void powersOfTwo()
{
    System.out.println("2^1 = " + 2);
    System.out.println("2^2 = " + 4);
    System.out.println("2^3 = " + 8);
    System.out.println("2^4 = " + 16);
    System.out.println("2^5 = " + 32);
    System.out.println("2^6 = " + 64);
    System.out.println("2^7 = " + 128);
    System.out.println("2^8 = " + 256);
    System.out.println("2^9 = " + 512);
    System.out.println("2^10 = " + 1024);
}
4.7. 
public int sum100()
{
    sum = 0;
    for (i = 1; i <= 100; i++)
        sum++;
    return sum;
}
4.9.
public int sumRange(int bottom, int top)
{
    if (top < bottom)
    {
        System.out.println("Error: this is not a valid range");
        return 0;
    }
    else 
    {
        sum = bottom;
        for (i = bottom; i <= top; i++)
            sum++;
        return sum;
    }
}
4.11. 
public String countA(String phrase)
{
    count = 0;
    for (i = 0; i < phrase.length(); i++)
    {
        if (phrase.charAt(i) == 'A')
            count++;
    }
    return count;
}
4.13.
public double average(int num1, int num2)
{
    avg = (num1 + num2) / 2.0;
    return avg;
}
