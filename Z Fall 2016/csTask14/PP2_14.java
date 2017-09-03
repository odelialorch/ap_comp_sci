
/**
 * Generates a random phone number in the form XXX-XXX-XXXX.
 * 
 * @odelialorch 
 * @10/13/16
 */
public class PP2_14
{
    public static void main()
    {
        // first three digits, not including 8 or 9
        int num1 = (int) (Math.random()*8);
        int num2 = (int) (Math.random()*8);
        int num3 = (int) (Math.random()*8);
        
        //second three digits, not greater than 742
        int num4 = (int) (Math.random()*743);
        
        //last four digits
        int num5 = (int) (Math.random()*10000);
        
        System.out.println("The phone number is "+num1+num2+num3+"-"+num4+"-"+num5+".");
    }
}