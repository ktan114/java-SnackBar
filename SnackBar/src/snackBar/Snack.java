
package snackBar;

public class Snack
{
    private static int maxID = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendID;

    public Snack(String name, int quantity, double cost, int vendID)
    {
        maxID++;
        id = maxID;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendID = vendID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int moreQuantity)
    {
        this.quantity += moreQuantity;
    }

    public void buySnack(int buyAmount)
    {
        this.quantity -= buyAmount;
    }

    public double totalCost(int givenQuantity)
    {
        return cost *= givenQuantity;
    }
}