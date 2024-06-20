// package OOP005;

public class Rectangle  extends Shape{
    private double width;
    private double length;
    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }
    public double calculateArea() {
        return length * width;
    }
    public void displayInfo() {
        System.out.println( "Shape:"+super.getName()+"|Area:" + String.format("%.2f",this.calculateArea()));
    }
}
