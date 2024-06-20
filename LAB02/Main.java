
import java.util.*;
public class Main {
    public static void main(String[] args){
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){     
            String input1;
            String input2;
            input1 = scanner.nextLine();
            input2 = scanner.nextLine();
            
            List<Customer> customers = new ArrayList<Customer>();
            String[] arr = input1.split("\\d+"); // tach theo so
            String[] arr1 = input1.split("\\D+"); // tach theo chu
           // int id=1;
           for (int i=0 ; i< Integer.parseInt(arr1[0]); i++){
            Customer c = new Customer(i+1,arr[i+1], Integer.parseInt (arr1[i+1]));
            customers.add(c);
        }
        String[] S2= input2.split("\\s+");
        for(int k=1; k<S2.length;k++){
            switch (S2[k]){
                case "rut":
                    int Rutid = Integer.parseInt(S2[k+1]);
                    int Rutamount = Integer.parseInt(S2[k+2]);
                    for(Customer c:customers){
                        if(Rutid  == Integer.parseInt(c.getId())){
                        c.withdraw(Rutamount);
                    }
                    }
                    break;
                case "nap":
                    int Napid = Integer.parseInt(S2[k+1]);
                    int Napamount = Integer.parseInt(S2[k+2]);
                     for(Customer c:customers){
                        if(Napid  == Integer.parseInt(c.getId())){
                        c.deposit(Napamount);
                    }
                    }
                    
                    break;
                case "chuyen":
                    int id1 = Integer.parseInt(S2[k+1]);
                    int id2 = Integer.parseInt(S2[k+2]);
                    int amount = Integer.parseInt(S2[k+3]);
                    for(Customer c:customers){
                        if(id1  == Integer.parseInt(c.getId())){
                              for(Customer c2:customers){
                        if(id2  == Integer.parseInt(c2.getId())){
                        c.transfer(c2, amount);
                    }
                    }
                    

            }
                    }
        }
        
        
       

    }
    for(Customer customer: customers){
        System.out.print(customer);
    }
        System.out.println();

}

}
}