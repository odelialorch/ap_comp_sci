------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: csTask19
VERSION or DATE: 11/2/16
AUTHORS: Odelia Lorch

MULTIPLE CHOICE:
3.7. b. num = 1, max = 2

TRUE OR FALSE:
3.8. True. An algorithm is a step-by-step process for solving a problem.

SHORT ANSWER:
3.7.
2
4
6
8
10
12
14
16
18
3.11. It is an infinite loop, because count will always be greater than 0 while it is increasing, so the 
    condition is never false. Three ways to solve this are:
    1. change the line "count = count + 1" to "count = count - 1"
    2. initialize count at 0 and make the condition "while (count <= 50)"
    3. do either step 1 or two and change the value to be printed from "(count)" to "(50-count)" to 
        reverse the order of the printed counting

3.13. 
while (num <=0)
    System.out.println("Please enter a positive integer.");
3.14.
final int SENTENIEL = 9
Scanner scan = new Scanner(System.in);
System.out.println("Enter an integer value:");
num = scan.nextInt();
while (num != SENTENIEL)
    System.out.println("You entered "+num);
    
