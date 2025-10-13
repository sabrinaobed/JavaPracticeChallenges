import java.util.Scanner;

public class PrimeNumberForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets find the number is Prime or not");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int numDivisibleCount = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                numDivisibleCount++;
            }
        }

        if(numDivisibleCount == 2){
            System.out.println(num + " is a PRIME NUMBER");
        }else{
            System.out.println(num + " is not a PRIME NUMBER");
        }






    }
}
