import java.util.*;
import java.util.regex.*;
import packet1.*;
public class Main{
   

    public static void main(String[] args){
        List<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        months.add("Sep");
        months.add("Oct");
        months.add("Nov");
        months.add("Dec");
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        scanner.nextLine();
        List<Account> accounts = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("Invalid input");
            }
            else 
            {
                Account account = new Account(input);
                accounts.add(account);
             }
        }
       
    
        while(scanner.hasNext()){
            String Str = scanner.nextLine(); 
            String[] input = Str.split(" ");
            int accountId = Integer.parseInt(input[0]);
            String AccountAction = input[1];
            Pattern regex =  Pattern.compile("^[0-9]{3}$");
            Pattern checkDayAndYear = Pattern.compile("^[0-9]{2}$");
            if(!regex.matcher(input[0]).find()){
                System.out.println("invalid input");
            } else {
            switch (AccountAction){
                case "Add":
                    if(!months.contains(input[2].substring(0,3))||!checkDayAndYear.matcher(input[2].substring(3,5)).find()
                    ||!checkDayAndYear.matcher(input[2].substring(5,7)).find()){
                        System.out.println("Invalid input");
                    } else {
                    Note note = new Note(Str.substring(8,Str.length()));
                    accounts.get(accountId-1).AddNote(note);
                            }
                    break;
                case "Share":
                    int ShareAccountId = Integer.parseInt(Str.substring(0,3));
                    int TargetAccountId = Integer.parseInt(Str.substring(10,13));
                    int NoteId = Integer.parseInt(input[3])-1;
                    accounts.get(TargetAccountId-1).AddNote(accounts.get(ShareAccountId-1).getNote().get(NoteId));
                    break;
                    

            }
        }

        }
        
                for(Account account : accounts){

                    System.out.println("Account: " +account.getName());
                    account.printNote();
                        
                }
  

                
    }
}
