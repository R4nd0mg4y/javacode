package ELAB2308;

public class SportCar extends Car{
	public SportCar(double price, int year) {
		super(price,year);
	}
	public double calculateSalePrice() {
		if(super.year > 2018) {
			super.price *=0.8;
		} else if(super.year > 2010) {
			super.price *=0.5;
		} else {
			super.price *=0.1;
		}
		MaxPrice(super.price);
		return super.price;
	}
}
