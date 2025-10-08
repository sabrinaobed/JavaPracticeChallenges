import java.util.Scanner;

public class MinOfNumbersChallenge01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets find minimum of two numbers");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int result = minNum(num1,num2);
        System.out.println("Minimum number: " + result);


    }

    public static int minNum(int num1, int num2){
        int result = num1 < num2 ? num1 : num2;
        return result;
    }
}

