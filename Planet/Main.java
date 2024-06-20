// package Planet;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double G = 6.67300e-11;
        double g = (5.976e+24)*(6.67300e-11)/(6.37814e6*6.37814e6);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.nextLine();
        double khoiluong = scanner.nextDouble();
        double bankinh = scanner.nextDouble();
        double kg = scanner.nextDouble();
        double res = ((khoiluong*G)/(bankinh*bankinh))/g;
        res = kg*res;
        System.out.println("Your weight on "+name +" is "+String.format("%.2f",res));
    }
}
