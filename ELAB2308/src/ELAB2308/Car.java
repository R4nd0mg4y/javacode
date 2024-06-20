package ELAB2308;
import java.text.*;
abstract class Car {
	protected double price;
	protected int year;
	public static double Max;
	DecimalFormat df = new DecimalFormat("#,###,###,###.00");
	public Car() {
		
	}
	public Car(double price,int year) {
		this.price = price;
		this.year = year;
	}
	public String toString() {
		return "Price: " +df.format(price)+ " VND | Year: " +year;
	}
	public static void MaxPrice(double price) {
		if(price > Max) {
			Max = price;
		}
	}
	abstract double calculateSalePrice();
	
}
