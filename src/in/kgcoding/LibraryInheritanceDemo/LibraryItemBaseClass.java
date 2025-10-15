package in.kgcoding.LibraryInheritanceDemo;

//a base class LibraryItem
public class LibraryItemBaseClass {

    //encapsulated private common attribute
    private  String  itemId;
    private  String  title;
    private  String  author;


    //constructor to initialize the values
    public LibraryItemBaseClass(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    //Getter and Setters to acces private data safely
    //getters
    public String getItemId(){return itemId;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}

    //setters
    public void setItemId(String itemId){this.itemId = itemId;}
    public void setTitle(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}

    //Display basic information common for all items
    public void dispalyinfo(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
