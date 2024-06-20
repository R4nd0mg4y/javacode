package LAB01_TwoSum;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-- >0) {
			String input = sc.nextLine();
			String S[] = input.split("\\s+");
			int size = Integer.parseInt(S[0]);
			Map<Integer,Integer> m = new HashMap<>();
			for(int i=1;i<=size;i++) {
				m.put(Integer.parseInt(S[i]),i-1);
			}
			int check = 0;
			int target = Integer.parseInt(S[S.length-1]);
			for(int i=1;i<=size;i++) {
				int c = target - Integer.parseInt(S[i]);	
				if(m.containsKey(c)&&m.get(c)!=i-1) {
					check = 1;
					System.out.println(i-1+" "+m.get(c));
					break;
                    
				}
			}
            if(check==0) {System.out.println("Not found");}
		}
       

	}

}