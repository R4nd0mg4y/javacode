package INTERFACE002;

public class CustomTacobox {
	private int tacos;
	public CustomTacobox(int initialTaco) {
		this.tacos = initialTaco;
	}
	public int tacoRemaining() {
		return tacos;
	}
	public void eat() {
		tacos-=1;
	}
	
}
