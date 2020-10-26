package javasnackbar;

public class VendingMachine {
    public static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name){
        maxId++;
        this.id = maxId;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Vending Machine: " + this.name;
    }
}
