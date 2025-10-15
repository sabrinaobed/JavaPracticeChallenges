package in.kgcoding.LibraryInheritanceDemo;


//Magazine inherits LibraryItem using extends
public class Magazine extends LibraryItemBaseClass{

    //unique attribute
    private int issueNumber;

    //Constructor
    public Magazine(String itemId, String title, String author, int issueNumber){
        super(itemId,title,author);
        this.issueNumber = issueNumber;
    }

    //Getter and Setter of unique attribute
    public int getIssueNumber() {return issueNumber;}
    public void setIssueNumber(int issueNumber) {this.issueNumber = issueNumber;}

    //Overide and display unqiue info

    @Override
    public void dispalyinfo() {
        super.dispalyinfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}
