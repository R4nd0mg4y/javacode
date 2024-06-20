import java.util.*;
public class Dao_so{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        while(t>0){
            int input = sc.nextInt();
            System.out.println(swapDigitPairs(input));
            t--;
        }
    }
    public static int swapDigitPairs(int input){
        int res = 0;
        int t = 1;
        while(input > 9){
            int digit1= input%10;
            input /=10;
            int digit2= input%10;
            input /=10;
            int tmp = digit1*10 + digit2;
            res = tmp*t + res;
            t*=100;
        }
        if(input > 0){
            res = input*t + res;
        }
        
        return res;
    }
}