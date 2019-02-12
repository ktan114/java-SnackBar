
package snackBar;

public class VendingMachine
{
    private static int maxID = 0;
    public int id;
    public String name;

    public VendingMachine(String name)
    {
        maxID++;
        id = maxID;
        this.name = name;
    }

    public String setName(String name)
    {
        this.name = name;
        return this.name;
    }
}

