package ELAB2313;

public class Line extends Point{
	private Point p1;
	private Point p2;
	public Line(Point p1, Point p2) {
		super(0,0,0);
		this.p1 = p1;
		this.p2 = p2;
	}
	public double Length() {
		return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY())+(p1.getZ()-p2.getZ())*(p1.getZ()-p2.getZ()));
	}
}
