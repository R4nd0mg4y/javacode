package INHERITANCE006;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fish = new Fish();
		fish.play();
		fish.walk();
		Cat cat = new Cat("Fluffy");
		cat.play();
		cat.eat();
		Spider spider = new Spider();
		spider.eat();
		cat.walk();
		spider.walk();
		
		
	}

}
