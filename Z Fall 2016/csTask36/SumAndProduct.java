
/**
 * Uses dialog boxes to input two integers and return their sum and product.
 * 
 * @author (odelialorch) 
 * @version (1/5/17)
 */
import javax.swing.JOptionPane;
public class SumAndProduct
{
    public static void main()
    {
        String num1Str, num2Str, result;
        int num1, num2, sum, product, again;
        
        do 
        {
            num1Str = JOptionPane.showInputDialog("Enter an integer: ");
            num1 = Integer.parseInt(num1Str);
            
            num2Str = JOptionPane.showInputDialog("Enter another integer: ");
            num2 = Integer.parseInt(num2Str);
            
            sum = num1 + num2;
            product = num1 * num2;
            
            result = "The sum of these integers is " + sum + ". \nThe product of these integers is " + product + ".";
            
            JOptionPane.showMessageDialog(null, result);
            
            again = JOptionPane.showConfirmDialog ( null, "Do another?");
        }
        while (again == JOptionPane.YES_OPTION);
    }
}
