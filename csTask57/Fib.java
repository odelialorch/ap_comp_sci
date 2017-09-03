/**
 * A utility class that provide methods to compute elements of the
 * Fibonacci sequence.
 */
public class Fib
{
    /**
     * Recursively computes fib(n)
     */
  public static int fib1(int n)
  {
    System.out.println("In fib1(" + n + ")");
    //Fill in code -- this should look very much like the
    //mathematical specification
    if (n == 0 || n == 1)
        return 1;
    else 
        return fib1(n-1) + fib1(n-2);
  }
  
  public static int fib2(int n)
  {
      int[] fibs = new int[n+1];
      fibs[0] = 1;
      fibs[1] = 1;
      for (int i = 2; i <= n; i++)
        fibs[i] = fibs[i-1] + fibs[i-2];
      return fibs[n];
  }
}
