// package EXCEPTION004;

public class Person {
    private String name;
    private Integer age;
    public Person(String name, Integer age) {
        
        this.name = name;
        this.age = age;
    }
    public String name() throws Exception{
        if (this.name.length() > 40 || this.name.isEmpty())
            throw new Exception("Name is not valid");
        else return this.name;
    }
    public int age() throws Exception{
        if (this.age < 0 || this.age > 120) throw new Exception("Age is not valid");
        else return age;
    }
    public String toString() {
        return"Name: "+name+"--Age:"+age;
    }

}
