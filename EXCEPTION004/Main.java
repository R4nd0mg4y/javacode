// package EXCEPTION004;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
        try { 
            Person person = new Person(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
            System.out.println("Name: "+ person.name()+ "--Age:"+person.age());
            
        } catch (Exception e){
            System.out.println(e.getMessage());
            }
        }
    }
}
