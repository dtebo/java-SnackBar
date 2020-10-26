package javasnackbar;

import java.text.DecimalFormat;

public class Customer {
    public static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");

    public Customer(String name, double cashOnHand){
        maxId++;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getCashOnHand(){
        return this.cashOnHand;
    }

    public String getFormattedCashOnHand(){
        return df.format(this.cashOnHand);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCashOnHand(double cashOnHand){
        this.cashOnHand = cashOnHand;
    }

    public void addCash(double amt){
        this.cashOnHand += amt;
    }

    public void buySnacks(double totalCost){
        this.cashOnHand -= totalCost;
    }
    
    @Override
    public String toString(){
        return "Customer\n\n" +
            "Name: " + this.name + "\n" +
            "Cash On Hand: " + this.cashOnHand;
    }
}
