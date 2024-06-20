import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String line = scanner.nextLine();
            try {
                check(line);
            } catch (Exception e) {
                System.out.println(e.getMessage()); // Print the exception message
            }
        }
        scanner.close(); // Close the scanner
    }

    public static void check(String line) throws Exception {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' ||
                    line.charAt(i) == 'A' || line.charAt(i) == 'E' || line.charAt(i) == 'O' || line.charAt(i) == 'U' ||
                    line.charAt(i) == 'u'||line.charAt(i) == 'I') {
                throw new Exception("String has vowels");
            }
        }
        System.out.println("String not contain vowels");
    }
}
