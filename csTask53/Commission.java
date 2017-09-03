/**
 * Represents a commissioned employee.
 * 
 * @author (odelialorch) 
 * @version (3/9/17)
 */
public class Commission extends Hourly
{
    private double totalSales = 0;
    private double commissionRate;
    
    public Commission(String name, String address, String phoneNum, String ssNum, double payRate, double commRate)
    {
        super(name, address, phoneNum, ssNum, payRate);
        commissionRate = commRate;
    }
    
    public void addSales(double total)
    {
        totalSales += total;
    }
    
    public double pay()
    {
        double payment = super.pay() + totalSales*commissionRate;
        totalSales = 0; // don't need to set hoursWorked back to 0 because it is set back to 0 in the parent class
        return payment;
    }
    
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}
