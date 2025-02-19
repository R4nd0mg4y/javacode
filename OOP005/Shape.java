// package OOP005;

public abstract class Shape {
    protected String name;
    public Shape(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract double calculateArea();
    public abstract void displayInfo();
}
