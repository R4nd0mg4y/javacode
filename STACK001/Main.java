// package STACK001;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            Stack<Integer> stack = new Stack<>();
            String input = scanner.nextLine();
            String[] S = input.split("\\s+");
            for (int i = 0; i < S.length ; i++) {
                stack.push(Integer.parseInt(S[i]));
            }
            Queue<Integer> queue = new LinkedList<>();
            queue = compressDuplicates(stack);
            String res = "";
            while(!queue.isEmpty()) {
                res += Integer.toString(queue.remove())+" ";
            }
            System.out.println(res.trim());
        }
    }
static Queue<Integer> compressDuplicates(Stack<Integer> s){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int tmp  = s.pop();
        stack.push(tmp);
        int count = 1;
        while(!s.isEmpty()){
            if(s.peek()==tmp){
                 count ++ ; 
                 s.pop();  
            }
            else {
                stack.push(count);
                count = 1;
                tmp = s.peek();
                stack.push(s.pop());
            }
        }
  
            // queue.add(s.pop());
            queue.add(count);
        
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
    }
    
}

