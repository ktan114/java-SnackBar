
package snackBar;

public class Main
{
    private static void snackBarFunction()
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.id);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.id);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.id);

        Snack soda = new Snack("Soda", 24, 2.50, drink.id);
        Snack water = new Snack("Water", 20, 2.75, drink.id);

        System.out.println("*** Query Data ***");

        jane.purchase(soda.totalCost(3));
        System.out.println("Jane purchases 3 sodas, current cash on hand " + jane.getCashOnHand());
        soda.addQuantity(-3);
        System.out.println("Amount left of soda: " + soda.getQuantity() + "\n");

        jane.purchase(pretzel.totalCost(1));
        System.out.println("Jane purchases 1 pretzel, current cash on hand " + jane.getCashOnHand());
        pretzel.addQuantity(-1);
        System.out.println("Amount left of pretzels: " + pretzel.getQuantity() + "\n");

        bob.purchase(soda.totalCost(2));
        System.out.println("Bob purchases 2 sodas, current cash on hand " + bob.getCashOnHand());
        soda.addQuantity(-2);
        System.out.println("Amount left of sodas: " + soda.getQuantity() + "\n");

        jane.addCash(10.00);
        System.out.println("Jane found $10.00, current cash on hand " + jane.getCashOnHand() + "\n");

        jane.purchase(chocolateBar.totalCost(1));
        System.out.println("Jane purchases 1 chocolate bar, current cash on hand " + jane.getCashOnHand());
        chocolateBar.addQuantity(-1);
        System.out.println("Amount left of chocolate bars: " + chocolateBar.getQuantity() + "\n");

        pretzel.addQuantity(12);
        System.out.println("Amount of pretzels: " + pretzel.getQuantity() + "\n");

        bob.purchase(pretzel.totalCost(3));
        System.out.println("Bob purchases 3 pretzels, current cash on hand " + bob.getCashOnHand());
        pretzel.addQuantity(-3);
        System.out.println("Amount left of pretzels: " + pretzel.getQuantity() + "\n");
    }
    public static void main(String[] args)
    {
        snackBarFunction();
    }
}