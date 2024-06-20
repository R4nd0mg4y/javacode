// package Big_Decimal;
import java.util.*;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String input = scanner.nextLine();
            String[] S = input.split("\\s+");
            BigDecimal sum = BigDecimal.ZERO;
            for(int i = 0 ; i < S.length ; i++) {
                // System.out.println(S[i]);
                BigDecimal d = new BigDecimal(S[i]);
                BigDecimal decimalPart = d.remainder(BigDecimal.ONE);
                d = d.remainder(BigDecimal.ONE);
                sum = sum.add( decimalPart);
            }
            System.out.println(sum);
        }
    }
}
