import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //generate a random number between 1 and 10
        int randomNumber = (int)(Math.random() * 10) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Im thinking of a number between 1 and 10...");

        //keep asking until the guess is correct
        while(guess != randomNumber){
            System.out.print("Enter your guessed number: ");
            guess = input.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Your guessed number is too low!Try again....");
            } else if (guess > randomNumber){
                System.out.println("Your guessed number is too high! Try again....");
            }else{
                System.out.println("Correct!You guessed the correct number in " + attempts + " tries. ");
            }


        }
    }
}
