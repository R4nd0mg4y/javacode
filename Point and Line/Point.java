
public class Point {
    // Private variables
    private String name;
    private double x; // x co-ordinate
    private double y; // y co-ordinate
    private double z; // y co-ordinate
    // Constructor
    public Point() {

    }
    public Point (String name, double x, double y, double z) {
       this.name = name;
       this.x = x;
       this.y = y;
       this.z = z;
    }
    public double getX () {
       return x;
    }
    public double getY () {
       return y;
    }
    public double getZ () {
       return z;
    }
    public String getName(){
       return name;
    }
   public String length(Point p2) {
       double len = Math.sqrt((this.getX()-p2.getX())*(this.getX()-p2.getX()) + (this.getY()-p2.getY())*(this.getY()-p2.getY()) + (this.getZ()-p2.getZ())*(this.getZ()-p2.getZ()));
       return String.format("%.2f",len);
   }   
    
    
}
