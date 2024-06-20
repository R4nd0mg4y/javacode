package Student_Class;


public class Student {
    private String name;
    private int age;
    static int numberOfStudent=0;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        numberOfStudent ++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getNum(){
        return numberOfStudent;
    }
    public void display() {
        if (this.age >= 18) {
            System.out.println(name);
        }
    }

}