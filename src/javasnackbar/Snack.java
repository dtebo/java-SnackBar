package javasnackbar;

import java.text.DecimalFormat;

public class Snack {
    public static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");

    public Snack(String name, int quantity, double cost, int vendingMachineId){
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingMachineId = vendingMachineId;
    }

    //Getters and Setters
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getCost(){
        return this.cost;
    }

    public int getVendingMachineId(){
        return this.vendingMachineId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void setVendingMachineId(int id){
        this.vendingMachineId = id;
    }

    public void addSnacks(int snackCount){
        this.quantity += snackCount;
    }

    public void buySnacks(int purchaseCount){
        this.quantity -= purchaseCount;
    }

    public double getTotalCost(int quantity){
        return this.cost * quantity;
    }
    
    public String getFormattedTotalCost(int quantity){
        double total = this.cost * quantity;

        return df.format(total);
    }

    @Override
    public String toString(){
        return "Testing";
    }
}
