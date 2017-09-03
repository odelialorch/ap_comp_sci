------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: csTask56
VERSION or DATE: 3/21/17
AUTHORS: Odelia Lorch

MULTIPLE CHOICE:
8.1. b. if (w < 0) return 0;
8.2. c. int x = mystery (w - 2);
8.3. c. 2
8.4. c. 3    
8.5. b. if (w < 0) return 0;
8.6. a. direct recursion

SHORT ANSWER:
8.3. 
int mult(int i, int j)
{
    if (i<=0)
        return 0;
    else
        return j + mult(i-1, j);
}
8.4.
int fib(int n)
{
    if (n==0 || n==1)
        return 1;
    else 
        return fib(n-2) + fib(n-1);
}
Using recursion for this sequence is very inefficient because for each term, especially further into the sequence,
the method is called multiple times and it uses up a lot of storage.
