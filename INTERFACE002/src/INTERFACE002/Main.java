package INTERFACE002;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripleTacobox t = new TripleTacobox();
		t.eat();
		t.eat();
		
		System.out.println("Triple taco boxes left: "+ t.tacoRemaining());
		CustomTacobox c = new CustomTacobox(8);
		c.eat();
		System.out.println("Custom taco boxes left: "+ c.tacoRemaining());
		
	}

}
