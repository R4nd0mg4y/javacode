public class Main {
    public static void main(String[] args) {
        Bankaccount savings = new Bankaccount("Jimmy");

        savings.deposit(10.00); //1st transaction

        savings.deposit(50.00); // 2nd transaction

        savings.deposit(10.00); //3rd transaction

        savings.deposit(70.00);  //4th transaction
        
        // Gọi phương thức transactionFee để kiểm tra phí
        savings.transactionFee(5.00);
        System.out.println(savings.getBalance());
        savings.transactionFee(10.00);
    }
    
}

