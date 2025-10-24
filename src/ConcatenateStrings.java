import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();

        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        //concatenate and convert to uppercase
        String result = (s1 + s2).toUpperCase();

        System.out.println("Concatenate string: " + result);
    }
}
