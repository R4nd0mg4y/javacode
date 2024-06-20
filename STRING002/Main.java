// package STRING002;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t -->0){
             String S = scanner.nextLine();
             String subS = scanner.nextLine();
             if(S.contains(subS)){
                System.out.println("true");
             } else {
                System.out.println("false");
             }
        }
    }
}
