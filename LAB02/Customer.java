class Customer {
    
    private String id;
    private String name;
    private int balance;
    Customer( int id,String name, int balance) {
        // id = CustomerID++;
        this.id = String.format("%03d",id);
        this.name = name;
        this.balance = balance;
    }
    public void withdraw(int amount) {
        if(amount > balance) {
            return;
        } else{
        balance -= amount;}
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public String getId() {
        return id;
    }
    public void transfer(Customer m, int amount) {
        if(amount > this.balance) {
            return;
        }
        else {this.balance -= amount;
        m.balance += amount;}
        
    }
     public String toString(){
        name = name.trim();
        return "[" + id + ", " + name + ", " + balance +"]";
    }

}