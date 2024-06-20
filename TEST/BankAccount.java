public class BankAccount {
    private String id;
    private double balance;
    private int transactions;

    public BankAccount(String id) {
        this.id = id;
        this.balance = 0.0;
        this.transactions = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getID() {
        return id;
    }

    public int getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if (amount > 0 && amount <= 500) {
            balance += amount;
            transactions++;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions++;
        }
    }

    public boolean transactionFee(double fee) {
        double totalFee = 0;
        for (int i = 1; i <= transactions; i++) {
            totalFee += fee * i;
        }
        if (totalFee <= balance) {
            balance -= totalFee;
            return true;
        } else {
            balance = 0;
            return false;
        }
    }

    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");
        savings.deposit(10.00); //1st transaction
        savings.deposit(50.00); // 2nd transaction
        savings.deposit(10.00); //3rd transaction
        savings.deposit(70.00); //4th transaction

        System.out.println("After applying transaction fee $5.00: " + savings.transactionFee(5.00));
        System.out.println("Remaining balance: $" + savings.getBalance());

        System.out.println("After applying transaction fee $10.00: " + savings.transactionFee(10.00));
        System.out.println("Remaining balance: $" + savings.getBalance());
    }
}
