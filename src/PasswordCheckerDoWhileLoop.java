import java.sql.SQLOutput;
import java.util.Scanner;

public class PasswordCheckerDoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "Java123";
        String enteredPassword;

        do{
            System.out.print("Enter password: ");
            enteredPassword = input.nextLine();

            if(!enteredPassword.equals(correctPassword)){
                System.out.println("Incorrect Password! Try again....");
            }

        }while(!enteredPassword.equals(correctPassword));
            System.out.println("Correct Password.Access granted!");



    }
}
