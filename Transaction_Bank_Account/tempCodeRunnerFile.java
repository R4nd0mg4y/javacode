public class Main {
    public static void main(String[] args) {
        Bankaccount savings = new Bankaccount("Jimmy");

        savings.deposit(10.00); //1st transaction

        savings.deposit(50.00); // 2nd transaction

        savings.deposit(10.00); //3rd transaction

        savings.deposit(70.00);  //4th transaction
        
        // Gọi phương thức transactionFee để kiểm tra phí
        savings.transactionFee(5.00);
        savings.transactionFee(10.00);
    }
    
}

class Bankaccount {
    private String id;
    private double balance;
    private int transactions;

    public Bankaccount(String id) {
        this.id = id;
        this.balance = 0;
        this.transactions = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getID() {
        return id;
    }

    public void transactionFee(double fee) {
        // Kiểm tra xem có giao dịch nào đã được thực hiện không
        if (transactions > 0) {
            double sum = 0;
            // Tính tổng phí
            for (int i = 1; i <= transactions; i++) {
                sum += fee * i;
            }
            // Kiểm tra xem số dư còn đủ để trả phí không
            if (sum >= balance) {
                System.out.println(sum + " false");
            } else {
                System.out.println(sum + " true");
            }
        } else {
            // Nếu không có giao dịch nào, tổng phí sẽ là 0
            System.out.println("0 true");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions++;
    }
}