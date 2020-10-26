package javasnackbar;

public class SnackBar{
    public static void main(String[] args){
        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, v1.getId());
        Snack cBar = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack pretzels = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack soda = new Snack("Soda", 24, 2.50, v2.getId());
        Snack water = new Snack("Water", 20, 2.75, v2.getId());

        Snack gum = new Snack("Gum", 10, 0.75, v3.getId());

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        c1.buySnacks(soda.getTotalCost(3));
        soda.buySnacks(3);

        System.out.println("Jane cash on hand " + c1.getFormattedCashOnHand());
        System.out.println("Quantity of Soda " + soda.getQuantity());

        c1.buySnacks(pretzels.getTotalCost(1));
        pretzels.buySnacks(1);

        System.out.println("Jane cash on hand " + c1.getFormattedCashOnHand());
        System.out.println("Quantity of Pretzel " + pretzels.getQuantity());

        c2.buySnacks(soda.getTotalCost(2));
        soda.buySnacks(2);

        System.out.println("Bob cash on hand " + c2.getFormattedCashOnHand());
        System.out.println("Quantity of Soda " + soda.getQuantity());

        c1.addCash(10.00);

        System.out.println("Jane cash on hand " + c1.getFormattedCashOnHand());

        c1.buySnacks(cBar.getTotalCost(1));
        cBar.buySnacks(1);

        System.out.println("Jane cash on hand " + c1.getFormattedCashOnHand());
        System.out.println("Quantity of Chocolate Bar " + cBar.getQuantity());

        pretzels.addSnacks(12);

        System.out.println("Quantity of Pretzel " + pretzels.getQuantity());

        c2.buySnacks(pretzels.getTotalCost(3));
        pretzels.buySnacks(3);

        System.out.println("Bob cash on hand " + c2.getFormattedCashOnHand());
        System.out.println("Quantity of Pretzel " + pretzels.getQuantity());

        System.out.println("\nSnack: " + chips.getName() + "\n" +
            "Vending Machine: " + v1.getName() + "\n" +
            "Quantity: " + chips.getQuantity() + "\n" +
            "Total Cost: " + chips.getFormattedTotalCost(36));

        System.out.println("\nSnack: " + cBar.getName() + "\n" +
            "Vending Machine: " + v1.getName() + "\n" +
            "Quantity: " + cBar.getQuantity() + "\n" +
            "Total Cost: " + cBar.getFormattedTotalCost(35));

        System.out.println("\nSnack: " + pretzels.getName() + "\n" +
            "Vending Machine: " + v1.getName() + "\n" +
            "Quantity: " + pretzels.getQuantity() + "\n" +
            "Total Cost: " + pretzels.getFormattedTotalCost(38));

        System.out.println("\nSnack: " + soda.getName() + "\n" +
            "Vending Machine: " + v2.getName() + "\n" +
            "Quantity: " + soda.getQuantity() + "\n" +
            "Total Cost: " + soda.getFormattedTotalCost(19));

        System.out.println("\nSnack: " + water.getName() + "\n" +
            "Vending Machine: " + v2.getName() + "\n" +
            "Quantity: " + water.getQuantity() + "\n" +
            "Total Cost: " + water.getFormattedTotalCost(20));
    }
}