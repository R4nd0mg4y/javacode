import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0){
            t--;
            String input1 = scanner.nextLine();
            String[] word1 = input1.split(" ");
            String input2 = scanner.nextLine();
            String[] word2 = input2.split(" ");
            Song song1 = new Song(word1[0],word1[1],Integer.parseInt(word1[2]));
            Song song2 = new Song(word2[0],word2[1],Integer.parseInt(word2[2]));
            if(song1.equals(song2)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        scanner.close();
        

    }
}
