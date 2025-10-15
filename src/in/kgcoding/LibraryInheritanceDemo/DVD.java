package in.kgcoding.LibraryInheritanceDemo;

//Magazine inherits LibraryItem using extends
public class DVD extends LibraryItemBaseClass{

    //unique attribute
    private int duration;

    //constrictor
    public DVD(String itemId,String title,String author,int duration){
        super(itemId,title,author);
        this.duration = duration;
    }

    //Getter and setters for unique attribute
    public int getDuration() {return duration;}
    public void setDuration(int duration) {this.duration = duration;}

    //Override parent method to display unique info

    @Override
    public void dispalyinfo() {
        super.dispalyinfo();
        System.out.println("Duration: " + duration + " minutes");
    }
}
