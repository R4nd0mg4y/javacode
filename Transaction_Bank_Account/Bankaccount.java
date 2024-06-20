public class Bankaccount {
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
        double sum = 0;
        for (int i = 1; i <= transactions; i++) {
            sum += fee * i;
        }
        if (sum > balance) {
            System.out.println(sum + " false");
        } else {
            balance -= sum;
            System.out.println(sum + " true");
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
