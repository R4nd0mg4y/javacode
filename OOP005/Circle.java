// package OOP005;

public class Circle extends Shape{
    private double radius;
    public Circle(String name,double radius){
        super(name);
        this.radius = radius;

    }
    public double calculateArea() {
        return Math.PI * radius *radius;
    }
    public void displayInfo() {
       System.out.println( "Shape:"+super.getName()+"|Area:" + String.format("%.2f",this.calculateArea()));
    }
}
