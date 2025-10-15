package in.kgcoding.LibraryInheritanceDemo;




//Book inherits LibraryItem using extends
public class Book extends LibraryItemBaseClass {

    //unique attribute to Book
    private String isbn;

    //Constructor with common and unique attribute
    public Book(String itemId, String title,String author,String isbn){
        //super() calls the constructor of the parent class
        super(itemId,title,author);
        this.isbn = isbn;
    }

    //Getter and Setter
    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}

    //Override displayInfo to show unique attribute

    @Override
    public void dispalyinfo() {
        super.dispalyinfo(); //will show common info from parent class
        System.out.println("ISBN: " +isbn);
    }
}
