// package car_class;
import java.text.DecimalFormat;

public class Car {   
    private String name;   
    private double price;
    private int year;
    // private static double highestPrice = 0;
    public Car(String name, double price, int year){
        this.name = name;
        this.price = price;
        this.year = year;
    }
    public double calculateSalePrice(){
        if(name.equals("CC")){
            price = price *1.12 + 20_000_000;
        } else {
            if (year > 2018) {
                price *= 0.8;
            } else if (year > 2010 && year <= 2018) {
                price *= 0.5;
            } else if (year <= 2010) {
                price *= 0.1;
            }
            
        }
        // hightestPrice = Math.max(hightestPrice,price);
        return price;

    }
    public double getPrice(){
        return price;
    }
   
    public String toString(){
        double p = calculateSalePrice();
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        String formattedPrice = formatter.format(p);
        return "Price: " + formattedPrice +" VND | Year: "+year;
    }
}
