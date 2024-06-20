public class Point{
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    } 
    public int getY() {
        return y;
    }
    public double slope(Point p){
        if(this.x != p.getX()){
        return (double) (this.y - p.getY()) / (this.x - p.getX());
    } else {
        return -1;
    }
    }
}
