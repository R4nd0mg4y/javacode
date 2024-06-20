// package STRING;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0){
            String input = scanner.nextLine();
            String S[] = input.split("\\s+");
            try{ check(S);
            int Max = 0;
            for(int i = 0; i < S.length; i++){
                Max = Math.max(Max, S[i].length());
            }
            for(int i = S.length-1; i >=0; i--){
                if(S[i].length() == Max){
                    System.out.println(S[i]);
                    break;
                }
            }

            } catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    }
    public static void check(String S[]) throws Exception {
        if(S.length ==0){
            throw new Exception("");
        }
    }
}
