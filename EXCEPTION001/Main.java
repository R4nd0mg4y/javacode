// package EXCEPTION001;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String input = scanner.nextLine();
            String S[] = input.split("\\s+");
            Amount amount1 = new Amount(S[0],Integer.parseInt(S[1]));
            Amount amount2 = new Amount(S[2],Integer.parseInt(S[3]));
            try{
                amount1.add(amount2);
                System.out.println(amount1.getAmount());
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
