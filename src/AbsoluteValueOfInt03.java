import java.util.Scanner;

public class AbsoluteValueOfInt03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Find absolute of given integer");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;

        System.out.println("Absolute num is: " + result);
    }
}
