
import java.util.*;

public class Main {

    // Phương thức kiểm tra năm nhuận
   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int t = Integer.parseInt(scanner.nextLine());
       while(t-- >0){
            String input = scanner.nextLine();
            FlightBooking flight = new FlightBooking();
            int seats = flight.getSeat();
            String[] S = input.split("\\s+");
            for(int i = 0; i < S.length; i++){
                if(S[i].equals("Booking")){
                    seats --;
                    System.out.print("[Seat Available: "+seats+"]");
                }
                if(S[i].equals( "Confirmed")){
                    // seats --;
                    System.out.print("--User "+S[i-1]+" Confirmed--"+"[Seat Available: "+seats+"]");
                }
                if(S[i].equals("Cancel")){
                    seats ++;
                    System.out.print("[Seat Available: "+seats+"]");
                }
                
            }
            System.out.println();
       }

    }

}