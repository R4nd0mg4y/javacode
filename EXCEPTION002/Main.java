import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            try{
                String i = scanner.nextLine();
                CheckFileExtension(i);
                System.out.println(1);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void CheckFileExtension(String filename) throws Exception{
        if(filename == null||filename.isEmpty() ){
            throw new Exception("Not java file exception.Mark is -1");
        }
        if(!filename.contains(".")){
            throw new Exception("0");
        }
        String[] S = filename.split("\\.");
        if(S.length == 1){
            throw new Exception("0");
        }
        if(!S[1].equals("java")){
            throw new Exception("0");
        }
    }
}
