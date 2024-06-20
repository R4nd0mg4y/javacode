import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0){
            String input = scanner.nextLine();
            String[] S = input.split("\\s+");
            
        
            Map<String,Integer> map = new HashMap<>();
            for(int i = 1; i< S.length ; i+=2){
                map.put(S[i-1],Integer.parseInt(S[i]));
            }
            Set<Map.Entry<String,Integer>> set = map.entrySet();
            Map<Integer,Integer> solMap = new HashMap<>();
            for(Map.Entry<String,Integer> entry : set){
                if(solMap.containsKey(entry.getValue())){
                    solMap.put(entry.getValue(),solMap.get(entry.getValue())+1);
                }
                else {
                    solMap.put(entry.getValue(),1);
                }
            }
            System.out.println(rarest(solMap));

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
