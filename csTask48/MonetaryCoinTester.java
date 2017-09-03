
/**
 * Instantiates, flips, and computes the sum of 5 monetary coins.
 * 
 * @author (odelialorch) 
 * @version (2/27/17)
 */
public class MonetaryCoinTester
{
    public static void main()
    {
        MonetaryCoin coin1 = new MonetaryCoin(25);
        MonetaryCoin coin2 = new MonetaryCoin(5);
        MonetaryCoin coin3 = new MonetaryCoin(10);
        MonetaryCoin coin4 = new MonetaryCoin(25);
        MonetaryCoin coin5 = new MonetaryCoin(5);
        int sum = coin1.getValue() + coin2.getValue() + coin3.getValue() + coin4.getValue() + coin5.getValue();
        
        System.out.println("Before flips: ");
        System.out.println("1: " + coin1 + "\n2: " + coin2 + "\n3: " + coin3 + "\n4: " + coin4 + "\n5: " + coin5);
        System.out.println("Sum: " + sum);
        
        coin1.flip();
        coin2.flip();
        coin3.flip();
        coin4.flip();
        coin5.flip();
        
        System.out.println("After flips: ");
        System.out.println("1: " + coin1 + "\n2: " + coin2 + "\n3: " + coin3 + "\n4: " + coin4 + "\n5: " + coin5);
        System.out.println("Sum: " + sum);
    }
}
