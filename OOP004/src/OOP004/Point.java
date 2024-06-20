package OOP004;

public class Point {
	private int x;
	private int y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double Distance(Point p) {
		return Math.sqrt((x-p.getX())*(x-p.getX())+(y-p.getY())*(y-p.getY()));
	}
}
