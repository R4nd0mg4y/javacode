// package OOP005;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String input1 = sc.nextLine();
            // String input2 = sc.nextLine();
            String S1[] = input1.split("\\s+");
            // String S2[] = input2.split("\\s+");
            if(S1[0].equals("Rectangle")){
                Rectangle r = new Rectangle("Rectangle",Integer.parseInt(S1[1]), Integer.parseInt(S1[2]));
                r.displayInfo();
            }
            if(S1[0].equals("Circle")){
                Circle c = new Circle ("Circle",Integer.parseInt(S1[1]));
                c.displayInfo();
            }
            // if(S2[0].equals("Rectangle")){
            //     Rectangle r = new Rectangle("Rectangle",Integer.parseInt(S2[1]), Integer.parseInt(S2[2]));
            //     r.displayInfo();
            // }
           
            // if(S2[0].equals("Circle")){
            //     Circle c = new Circle ("Circle",Integer.parseInt(S2[1]));
            //     c.displayInfo();
            // }


        }
    }
}
