// package INHERITANCE002;

public class Item {
    private String name;
    private int weight;
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public Item(String name){
        this.name = name;
    }
    public int getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
}
