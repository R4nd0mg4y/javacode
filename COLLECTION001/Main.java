import java.util.ArrayList;
import java.util.Scanner;

class Point {
    // Private variables
    private double x; // x co-ordinate
    private double y; // y co-ordinate
    private double z; // z co-ordinate

    // Constructor
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Public methods
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

class Line {
    private Point startPoint;
    private Point endPoint;

    // Constructor
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Method to calculate the length of the line
    public double calculateLength() {
        double dx = endPoint.getX() - startPoint.getX();
        double dy = endPoint.getY() - startPoint.getY();
        double dz = endPoint.getZ() - startPoint.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();

        // Read points from input
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split("\\s+");
            
            String pointName = parts[0];
            double x = Double.parseDouble(parts[1]);
            double y = Double.parseDouble(parts[2]);
            double z = Double.parseDouble(parts[3]);
            points.add(new Point(x, y, z));
        }

        // Check if there are at least two points
        if (points.size() < 2) {
            System.out.println("invalid input");
            return;
        }

        // Calculate the length of all lines
        double totalLength = 0;
        Point start = points.get(0);
        for (int i = 1; i < points.size(); i++) {
            Point end = points.get(i);
            if (start.getX() == end.getX() && start.getY() == end.getY() && start.getZ() == end.getZ()) {
                System.out.println("same point");
                return;
            }
            Line line = new Line(start, end);
            totalLength += line.calculateLength();
            start = end;
        }

        // Print the total length with two decimal places
        System.out.printf("%.2f%n", totalLength);
    }
}
