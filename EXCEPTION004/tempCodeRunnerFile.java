// package EXCEPTION004;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
        try { 
            Person person = new Person(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            System.out.println(person.toString());
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    }
}
