import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0){
            String input = scanner.nextLine();
            String[] S = input.split("\\s+");
            Set<String> set = new HashSet<>();
        
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i = 1; i< S.length ; i+=2){
                
                int key = Integer.parseInt(S[i]);
                if(map.containsKey(key)&&!set.contains(S[i-1])){
                    int value = map.get(key) + 1;
                    map.put(key,value);
                    // set.add(S[i-1]);

                } else{
                    // set.add(S[i-1]);
                    map.put(key,1);
                }
                set.add(S[i-1]);
            }
            System.out.println(rarest(map));

        }
    }
    public static int rarest(Map<Integer,Integer> map){
        int Min = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        
        for(Integer key:map.keySet()){
            Min = Math.min(Min,map.get(key));
           
        }
        for(Integer key:map.keySet()){
           
            if(Min == map.get(key)){
                res = Math.min(key,res);
            }
        }
        return res;
    }
   
}
