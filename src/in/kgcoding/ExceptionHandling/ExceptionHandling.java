package in.kgcoding.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to divison game");
        System.out.print("Enter two number you want to divide: ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        try{
            int result = firstNum / secondNum;
            System.out.println("The result for division: " + result);
        }catch(ArithmeticException ex){
            System.out.println("Zero cant be divided, input valid numbers for division");
        }
    }
}
