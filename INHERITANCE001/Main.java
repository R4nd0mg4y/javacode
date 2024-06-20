package INHERITANCE001;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(student.toString());
        student.getCredit();
        student.study();
        student.getCredit();
    }
}
