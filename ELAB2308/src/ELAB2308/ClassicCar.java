package ELAB2308;

public class ClassicCar extends Car{
	
public  ClassicCar (double price, int year) {
	super(price,year);
}
public double calculateSalePrice() {
	super.price*=1.12;
	super.price += 20_000_000;
	MaxPrice(super.price);
	return super.price;
}
}
