// package POLYMORPHISM002;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String input = scanner.nextLine();
            String S[] = input.split("\\s+");
            Organism o = new Organism(Integer.parseInt(S[0]), Integer.parseInt(S[1]));
         
            o.move(1,1);
            System.out.println(o.toString());
        }
    }
}
