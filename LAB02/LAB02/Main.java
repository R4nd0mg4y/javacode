package LAB02;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		String S = sc.nextLine();
		String comparedNumber ="";
		for(int i = 11;i<S.length()-1;i++) {
			comparedNumber += S.charAt(i);
		}
		System.out.println(number.equals(comparedNumber));
		

	}

}
