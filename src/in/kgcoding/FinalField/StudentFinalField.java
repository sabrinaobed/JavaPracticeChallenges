package in.kgcoding.FinalField;

public class StudentFinalField {
    //final fields
    private final String name;
    private final int age;


    //constructor to initialize final fields
    public StudentFinalField(String name,int age){
        this.name = name;
        this.age = age;

    }

    //method to display details
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: "  + age);
    }



}
