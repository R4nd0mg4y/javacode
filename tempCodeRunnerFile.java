import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0){
                t--;
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("");
            } else {
            String S[] = input.split(" ");
            Stack<Integer> stack = new Stack<Integer>();
            for(int i=S.length-1; i>=0; i--){
                stack.add(Integer.parseInt(S[i]));
            }
           
            compressDuplicates(stack);
          
            PrintStack(stack);

        }
    }
    scanner.close();
    }
    public static void compressDuplicates(Stack<Integer> s) {
        Queue<Integer> queue = new LinkedList<>();
        
        if (s.isEmpty()) return;
        
        int save = s.pop();
        int count = 1;
        
        while (!s.isEmpty()) {
            int current = s.peek();
            if (save == current) {
                count++;
            } else {
                queue.offer(count);
                queue.offer(save);
                save = current;
                count = 1;
            }
            s.pop();
        }
        
        queue.offer(count);
        queue.offer(save);
        
        // Rebuilding the original stack
        while (!queue.isEmpty()) {
            s.push(queue.poll());
        }
    }
    static void PrintStack(Stack<Integer> s) 
{ 
    // If stack is empty then return 
    if (s.isEmpty()) 
        return; 
     
    int x = s.peek(); 
 
    // Pop the top element of the stack 
    s.pop(); 
 
    // Recursively call the function PrintStack 
    PrintStack(s); 
 
    // Print the stack element starting 
    // from the bottom 
    System.out.print(x + " "); 
 
    // Push the same element onto the stack 
    // to preserve the order 
    s.push(x); 
} 
}


