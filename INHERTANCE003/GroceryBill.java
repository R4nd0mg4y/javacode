// package INHERTANCE003;
import java.util.*;
public class GroceryBill {
    private Employee clerk;
    private List<Item> receipt = new ArrayList<>();
    private double total=0;
    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
    }
    public void add(Item i){
        total = total + i.getPrice();
        receipt.add(i);
    }
    public double getTotal(){
        return total;
    }
    public Employee getClerk(){
        return clerk;
    }
    public List<Item> getReceipt(){
        return receipt;
    }
    public String toString(){
        
        String res="items:\n";
        for(Item i : receipt){
            res +="   " + i.toString()+"\n";
        }
        res += "total: $"+ String.format("%.2f",total) +"\n";
        res +="Clerk: " + clerk.getName();
        return res;
    }
}
