------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: csTask52
VERSION or DATE: 3/9/17
AUTHORS: Odelia Lorch

True or False:
7.10. false

AP Multiple Choice:
7.6. a. Speaker a = new Philosopher();

AP Free Response:
7.1. 
a.
public class Perishable extends InventoryItem
{
    private expDate;
    public Perishable(Date entry, Date expiration, double price)
    {
        super(entry, price);
        expDate = expiration;
    }
    
    public double getPrice()
    {
        double price = super.getBasePrice();
        if (super.getEntryDate().compareTo(expDate) < 0)
            price = super.getBasePrice() * 0.1;
        return price;
    }
}
b.
public ArrayList<InventoryItem> getItems(double loPrice, double hiPrice)
{
    ArrayList<InventoryItem> items2 = new ArrayList<InventoryItem>();
    for (int i = 0; i < items.size; i++)
    {
        if (items.get(i) >= loPrice && items.get(i) <= hiPrice)
            items2.add(items.get(i));
    }
    return items2;
}