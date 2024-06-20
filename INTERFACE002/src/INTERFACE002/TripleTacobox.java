package INTERFACE002;

public class TripleTacobox implements TacoBox{
	private int tacos;
	public TripleTacobox() {
		this.tacos = 3;
		}
	public int tacoRemaining() {
		return tacos;
	}
	public void eat() {
		tacos-=1;
	}
	
}
