// package OOP002;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            
            String input = scanner.nextLine();
            String S[] = input.split("\\s+");
            Rectangle r = new Rectangle(Integer.parseInt(S[0]), Integer.parseInt(S[1]), Integer.parseInt(S[2]), Integer.parseInt(S[3]));
            System.out.println(r.toString());
        }
    }
}
