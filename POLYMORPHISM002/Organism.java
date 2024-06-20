// package POLYMORPHISM002;
// interface Moveable {
//     public void move(int dx,int dy);
// }
public class Organism implements Moveable {
    private int x;
    private int y;
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int dx,int dy){
        x = x + dx;
        y = y + dy;
    }
    public String toString() {
        return "x:"+x +";y:"+y;
    }
}
