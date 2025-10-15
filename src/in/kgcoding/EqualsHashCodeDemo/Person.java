package in.kgcoding.EqualsHashCodeDemo;

public class Person {

    //encapsulated attributes
    private String name;
    private int age;

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getters and Setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    //Override equals() to compare name and age
    @Override
    public boolean equals(Object obj){
        //Step 1: check if same object
        if(this == obj)
            return true;

        //Step 2: Check if null or different type
        if(obj == null  || getClass() != obj.getClass())
            return false;

        //Step 3: Cast to Person and compare attributes
        Person other = (Person) obj;
        return this.age == other.age &&
                (this.name !=null && this.name.equals(other.name));
    }

        //Override hashCode() consistent with equals()
        public int hashCode(){
        int result = 17; // a random base number
        result =  31 *  result + age; // multiply by prime and add age
        result = 31 * result + ( name == null ? 0 : name.hashCode());
        return result;

    }

        //for printing persons details
         @Override
        public String toString(){
        return "Person{name'" + name + "', age=" + age + "}";
    }


}
