package ELAB2308;
import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		Car car;
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		while(t-- >0) {
			String input = sc.nextLine();
			String S[] = input.split("\\s+");
			
			if(S[0].equals("SC")) {
				car = new SportCar(Double.parseDouble(S[1]), Integer.parseInt(S[2]));
			} else {
				car = new ClassicCar(Double.parseDouble(S[1]), Integer.parseInt(S[2]));
			}
			car.calculateSalePrice();
			System.out.println(car.toString());
		}
		System.out.println("Most Expensive: " +df.format(Car.Max) +" VND");

	}

}
