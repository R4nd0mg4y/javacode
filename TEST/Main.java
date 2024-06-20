import java.util.*;

class Point {
    // Private variables
    String name;
    private double x; // x co-ordinate
    private double y; // y co-ordinate
    private double z; // z co-ordinate

    // Constructor
    public Point(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

public class Main {

    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name;
        String targetName = null;
        boolean invalidInput = false;

        while (sc.hasNext()) {
            try {
                name = sc.next();
                if (name.length() != 1) {
                    invalidInput = true;
                    break;
                }
                String S[] = sc.nextLine().trim().split("\\s+");
                if (S.length != 3) {
                    invalidInput = true;
                    break;
                }
                double x = Double.parseDouble(S[0]);
                double y = Double.parseDouble(S[1]);
                double z = Double.parseDouble(S[2]);
                Point p = new Point(name, x, y, z);
                list.add(p);
                targetName = name;
            } catch (NoSuchElementException e) {
                break;
            } catch (Exception e) {
                invalidInput = true;
                break;
            }
        }

        if (invalidInput || targetName == null) {
            System.out.println("invalid input");
        } else {
            Point target = null;
            for (Point p : list) {
                if (p.getName().equals(targetName)) {
                    target = p;
                    break;
                }
            }
            if (target != null) {
                for (Point p : list) {
                    if (!target.getName().equals(p.getName())) {
                        double x1 = Math.pow(target.getX() - p.getX(), 2);
                        double x2 = Math.pow(target.getY() - p.getY(), 2);
                        double x3 = Math.pow(target.getZ() - p.getZ(), 2);
                        double distance = Math.sqrt(x1 + x2 + x3);
                        System.out.println("Line " + target.getName() + "" + p.getName() + ": " + distance);
                    }
                }
            }
        }
    }
}
