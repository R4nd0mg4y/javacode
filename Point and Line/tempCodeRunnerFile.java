import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<Point> points = new ArrayList<>();
        Point targetPoint = new Point();
        String target = ""; // Initialize target with an empty string
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        outerloop:  while (sc.hasNextLine()) {
            try{
            String name = sc.nextLine();
            if(name.length() > 1){
                System.out.println("invalid input");
                check = false;
                break outerloop;
            }
            
            
            
            String threePoint = sc.nextLine();
            if(threePoint.isEmpty()){
                break outerloop;
            }
            
            String[] S = threePoint.split("\\s+");
            // System.out.println(name);
            if(S.length != 3){
                System.out.println("invalid input");
                check = false;
                break outerloop;
            }
            
            double x = Double.parseDouble(S[0]); 
            double y = Double.parseDouble(S[1]); 
            double z = Double.parseDouble(S[2]); 

            Point point = new Point(name, x, y, z);
            // System.out.println(point.getName());

            points.add(point);
            }catch(Exception e){
                break outerloop;
            }

            
        }
            
        
        if(check){
            check = false;
        for(Point p:points) {
            if ((p.getName()).equals(target)) {
                targetPoint = p;
                
                check = true;
            }
        }
        if(!check){System.out.println("invalid input");}
        if(check){
        for (Point p : points) {
            if (!p.getName().equals(targetPoint.getName())) {
                double res = Double.parseDouble(targetPoint.length(p));
                if(res!=0){
                System.out.print("Line " + targetPoint.getName() + "" + p.getName() + ": ");
                System.out.print(targetPoint.length(p));} else {
                    System.out.print("Line " + targetPoint.getName() + "" + p.getName() + ": same point");
                }
                System.out.println();
            }
        }
    }
    }
        // System.out.println(target);
    }
}

