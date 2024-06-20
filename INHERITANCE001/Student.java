package INHERITANCE001;

public class Student extends Person {
    static private int credit = 0;
    public Student(String name, String address) {
        super(name, address);
        
    }
    public void study(){
        credit++;
    }
    public void getCredit(){
        System.out.println("Study credits"+credit);
    }

    
}
