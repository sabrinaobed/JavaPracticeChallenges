import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameDoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secretNum = random.nextInt(10)+1;
        int guess;

        System.out.println("Welcome to Number Guesisng Game: ");
        System.out.println("I have picked number between 1 to 10. Guess the correct number!");

        do{
            System.out.print("Enter the number: ");
            guess = input.nextInt();

            if(guess < secretNum){
                System.out.println("Too low! Try again");
            }else if(guess > secretNum){
                System.out.println("Too high!Try again");
            }
        }while(guess != secretNum);
            System.out.println("Correct! The secret number is: " + secretNum);


        System.out.println("Thanks for playing");

    }
}
