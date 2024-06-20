// package car_class;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        double max = 0;
        while(t-->0){
            String input = scanner.nextLine();
            String[] S = input.split("\\s+");
            Car car = new Car(S[0],Double.parseDouble(S[1]),Integer.parseInt(S[2]));
            System.out.println(car.toString());
            max = Math.max(max,car.getPrice());

        }
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String formatmax = df.format(max);
        System.out.println("Most Expensive: "+formatmax+" VND");
    }
}

