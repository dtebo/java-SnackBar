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
    }
}