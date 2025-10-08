import java.util.Scanner;

public class FindEvenOrOddNum02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lets find if the number is Odd or Even");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        String result = evenOrOdd(num);
        System.out.println(num + " is " + result);



    }

    public static String evenOrOdd(int num){
        String result = num % 2 == 0 ? "Even" : "Odd";
        return result;
    }
}
