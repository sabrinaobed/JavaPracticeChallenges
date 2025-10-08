import java.util.Scanner;

public class AirthmeticOperatorSwitch06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perform airthmetic operations:");

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Now enter the airthmetic operation: ");
        String operation = input.next();

        int result = switch(operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;

        };

        System.out.println("Your answer is: " + result);


    }
}
