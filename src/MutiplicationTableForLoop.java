import java.util.Scanner;

public class MutiplicationTableForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets create a Multiplication Table for a given number");
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int result;
        System.out.println("The Multiplication table for " + num + " : ");

        for(int i = 1; i <= 10; i++){
            result = num * i;


            System.out.println(i + " x " + num + " = " + result);
        }
    }
}
