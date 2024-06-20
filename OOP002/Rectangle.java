// package OOP002;

public class Rectangle {
    private int x,y,width,height;
    public Rectangle(int x,int y,int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public String toString() {
        return "Rectangle[x=" +x +",y=" + y +",width="  +width+ ",height=" + height+"]";
    }
}
