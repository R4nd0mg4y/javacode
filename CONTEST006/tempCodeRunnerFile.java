// package CONTEST006;

public class Main {
    public static void main(String[] args){
        Money a = new Money(10, 8);
        System.out.println(a.toString());
        Money b = new Money(5, 5);
        System.out.println(b.toString());
        Money c = a.plus(b);
        System.out.println(c.toString());
        Money u = new Money(10,0);
        Money y = new Money(3,0);
        Money w = new Money(5,0);
        System.out.println(u.lessThan(y));
        System.out.println(y.lessThan(w));
        Money m = new Money(10,0);
        System.out.println(m.toString());
        Money n = new Money(3,50);
        System.out.println(n.toString());
        Money o = m.minus(n);
        System.out.println(o.toString());
        o = o.minus(m);
        System.out.println(o.toString());

    }

    
}
