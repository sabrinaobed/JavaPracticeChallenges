package in.kgcoding.EqualsHashCodeDemo;

public class MainTest {
    public static void main(String[] args) {
        Person p1 = new Person("Verdha", 29);
        Person p2 = new Person("Sadrik",25);
        Person p3 = new Person("Verdha",29);

        //equals()
        System.out.println("p1 equals p2? " + p1.equals(p2));
        System.out.println("p1 equals p3? " + p1.equals(p3));

        //hashCode()
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p2 hashCode: " + p3.hashCode());
    }
}
