// package CONTEST006;

public class Money {
    private int euros;
    private int cents;
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }
    
    public String toString() {
        return String.format("%.2f",(double)euros + (double)cents/100) +"e";
    }
    public int getCents(){
        return cents;
    }
    public int getEuros(){
        return euros;
    }
    public Money plus(Money added){
        // Money res = new Money(0,0);
        int euros1 = this.euros + added.getEuros();
        int cents1 = this.cents + added.getCents();
        Money res = new Money(euros1,cents1);
        return res;
    }
    public boolean lessThan(Money compared){
        if(this.getCents() + this.getEuros() < compared.getCents()+ compared.getEuros()){
            return true;
        }
        return false;
    }
    public Money minus(Money minus){
        // Money res = new Money(0,0);
        int cents1;
        int euros1;
        if(this.cents == 0) {
            cents1 = 100 - minus.getCents(); 
            euros1 = this.euros - minus.getEuros()-1;
         }
        else {cents1 = this.cents - minus.getCents();
         euros1 = this.euros - minus.getEuros();}
       
        // int cents1 = this.cents - minus.getCents();
        if(euros1  < 0 ){
            euros1 = 0;
            cents1 = 0;
        }
        // if(cents1 < 0 ){
        //     cents1 = 0;
        // }
        Money res = new Money(euros1,cents1);
        return res;
    }
}
