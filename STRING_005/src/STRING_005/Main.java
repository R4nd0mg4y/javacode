package STRING_005;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s = sc.nextLine();
			System.out.println(isPangram(s));
		}
		
	}
	public static boolean isPangram(String sentence) {
		Map<Character, Integer> M = new HashMap<Character, Integer>();
		sentence = sentence.toLowerCase();
		for(char c = 'a' ; c <= 'z' ; c++) {
//			char c = 'a';	
			M.put(c, 0);
//			c++;
		}
		for(int i = 0 ; i<sentence.length(); i++) {
			if(M.containsKey(sentence.charAt(i))) {
				int val = M.get(sentence.charAt(i))+1;
				M.put(sentence.charAt(i), val);
			}
		}
		for(Character c: M.keySet()) {
			if(M.get(c)==0) {
				return false;
			}
		}
		return true;

		}

}
