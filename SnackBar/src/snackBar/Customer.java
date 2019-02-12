
package snackBar;

public class Customer
{
    private static int maxID = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public void addCash(double moreCash)
    {
        this.cashOnHand += moreCash;
    }

    public void purchase(double totalCash)
    {
        this.cashOnHand -= totalCash;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }
}