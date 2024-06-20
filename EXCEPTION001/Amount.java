// package EXCEPTION001;

public class Amount {
    private String currency;
    private int amount;
    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public String getCurrency(){
        return currency;
    }
    public int  getAmount(){
        return amount;
    }
    public int add(Amount amount) throws Exception {
            if(!this.currency.equals(amount.getCurrency())){
                throw new Exception("Currency doesn't match");
            }
            this.amount += amount.getAmount();
            return this.amount;
    }
}
