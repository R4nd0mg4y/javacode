// package STRING003;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            if(s1.equals(s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
