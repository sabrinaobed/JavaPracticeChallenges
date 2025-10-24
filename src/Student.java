public class Student {
    //attributes
    private String name;
    private int age;

    //constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Override toString() method
    public String toString(){
        return "Student{name='" + name + "', age=" + age + "}";

    }

    //Main method to test
    public static void main(String[] args) {
        //create a student object
        Student s1 = new Student("Alice",20);
        Student s2 = new Student("Bob", 22);

        //print details
        System.out.println(s1);
        System.out.println(s2);
    }

}
