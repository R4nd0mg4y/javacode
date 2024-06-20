public class Main {
    public static void main(String[] args) {
        Employee clerk1 = new Employee("Grocery Bill");
        Employee clerk2 = new Employee("Discount Bill");
        GroceryBill groceryBill = new GroceryBill(clerk1);
        Item item1 = new Item("item 1",2.3,0);
        Item item2 = new Item("item 2",3.45,0);
        Item item3 = new Item("item 3",20,15);
        Item item4 = new Item("item 4",40,35);
        Item item5 = new Item("item 5",50,35);

        groceryBill.add(item1);
        groceryBill.add(item2);
        System.out.println(groceryBill.toString()); 
        System.out.println();
        DiscountBill bill = new DiscountBill(clerk2);
        bill.add(item3);bill.add(item4);bill.add(item5);
        System.out.println(bill.toString());
    }
}
