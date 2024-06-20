// package COLLECTION002;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t --> 0){
            String input = scanner.nextLine();
            String[] S = input.split("\\s+");
            List<String> list = new ArrayList<String>();
            for(int i = 0; i < S.length;i++){
                list.add(S[i]);
            }
            String last = "";
            if(list.size()%2!=0){
                last = list.remove(list.size()-1);
            }
            removeShorterStrings(list);
            String res = "";
            for(String word : list){
                res += word +" ";
            }
            res += last;
            System.out.println(res.trim());


    }
}
public static void removeShorterStrings(List<String> list){
    int Size = list.size();
    // if(Size % 2!=0){
    //     Size--;
    // }
        for(int i = 0; i < list.size();i++){
            if(list.get(i).length()>list.get(i+1).length()){
                list.remove(i+1);
                // i--;
            }
            else if(list.get(i).length()<list.get(i+1).length()){
                list.remove(i);
                // i--;
            }
            else {
                list.remove(i);
                // i--;
            }
            
        }
    }
}
