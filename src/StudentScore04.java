import java.util.Scanner;

public class StudentScore04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lets check student level according to score");
        System.out.print("Enter student score: ");
        int studentScore = input.nextInt();

        String scorecategory = studentScore > 80 ? "High" :(studentScore > 50 ? "Moderate" : "Low");
        System.out.println("Your score category is: "+ scorecategory);
    }
}
