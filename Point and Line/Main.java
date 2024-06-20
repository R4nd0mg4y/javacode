import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<Point> points = new ArrayList<>();
        Point targetPoint = new Point();
        String target = ""; // Initialize target with an empty string
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        outerloop:  while (true) {
            try{
            String name = sc.nextLine();
                   target = name;
            String threePoint = sc.nextLine();
    
            
            String[] S = threePoint.split("\\s+");
            // System.out.println(name);
            if(S.length != 3){
                // System.out.println("invalid input");
        
                break;
            }
            
            double x = Double.parseDouble(S[0]); 
            double y = Double.parseDouble(S[1]); 
            double z = Double.parseDouble(S[2]); 

            Point point = new Point(name, x, y, z);
            // System.out.println(point.getName());
            
            points.add(point);
            // target = name;
            }catch(Exception e){
                break;
            }

            
        }
        for(Point p:points){
            if(p.getName().equals(target)){
                targetPoint = p;
                check = true;
                break;
            }
        }
        if(check){
        for(Point p:points){
            if(!p.getName().equals(target)){
                if(targetPoint.length(p).equals("0.00")){
                    System.out.println("Line "+target +""+p.getName()+ ": same point");
                } else {
                    System.out.println("Line "+target +""+p.getName()+ ": "+ targetPoint.length(p));
                }


            }
        }
            
    } else {
        System.out.println("invalid input");
    }
       
        System.out.println(target);
    }
}

