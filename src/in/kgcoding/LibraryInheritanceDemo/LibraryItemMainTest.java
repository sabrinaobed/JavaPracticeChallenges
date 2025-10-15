package in.kgcoding.LibraryInheritanceDemo;

public class LibraryItemMainTest {
    public static void main(String[] args) {
        //create one object for each subclass
        Book book = new Book("001","Life in Sweden","Sabrina Obed","001-1234567890");
        Magazine magazine = new Magazine("Fashion World","Paris Courture","Karan Johar",001);
        DVD dvd = new DVD("Series","Friends","Me",130);

        //Display info for each subclass
        System.out.println("----------BOOK DETAILS----------");
        book.dispalyinfo();

        System.out.println("-----------MAGAZINE DETAILS----------------");
        magazine.dispalyinfo();

        System.out.println("------------DVD----------------------------");
        dvd.dispalyinfo();
    }
}
