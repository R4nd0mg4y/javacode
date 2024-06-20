public class Dog {
    private String name;
    private String breed;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void SetAge(int age){
        this.age = age;
    }
    public void printDogDetail(){
        System.out.println("Name:"+name +"--Breed:" + breed +"--Age:" + age);
    }
}
