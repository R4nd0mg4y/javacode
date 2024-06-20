public class DiscountBill  extends GroceryBill {
    private double discountAmount=0;
    public DiscountBill(Employee clerk){
        super(clerk);
    }
    public void add(Item i){
        super.add(i);
        discountAmount += i.getDiscount();
    }
    public String toString(){
        String res="items:\n";
        for(Item i : super.getReceipt()){
            res +="   " + i.toString()+"\n";
        }
        res += "sub-total: $"+ String.format("%.2f",super.getTotal())+"\n";
        res += "discount: $"+ String.format("%.2f",discountAmount)+"\n";
        res += "total: $"+ String.format("%.2f",super.getTotal()-discountAmount)+"\n";
        res +="Clerk: " + super.getClerk().getName();
        return res;
        }
    }


