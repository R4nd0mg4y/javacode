package INHERITANCE001;

public class Person {
    private String name;
    private String address;
    public String toString() {
        return name +" - " +address;
    }
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

