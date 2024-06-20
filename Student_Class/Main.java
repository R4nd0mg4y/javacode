package Student_Class;
// import Student_Class.*;
import java.util.*;
public class Main {
    public static void main(String[]args){
     Scanner scanner = new Scanner(System.in);
     List<Student> students = new ArrayList<>();
     while(scanner.hasNextLine()){
        String name=scanner.nextLine();
         // Check if there's another line before reading the age
        //  if (scanner.hasNextLine()) {
            int age = Integer.parseInt(scanner.nextLine());
            Student student = new Student(name, age);
            students.add(student);
            // student.display();
     }
     for(Student student : students){
        student.display();
     }
     System.out.println(students.get(students.size()-1).getNum());
       
     
      scanner.close(); 
    }
}

