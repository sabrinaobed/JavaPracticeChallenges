import java.util.Scanner;

public class ContinueSumOfPositiveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  number;
        int sum = 0;
        System.out.println("Enter numbers to add(enter 0 to stop: ");
        while(true){
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if(number == 0){
                System.out.println("Exiting! only adding above numbers");

                break; //stop the loop and exit
            }
            if(number < 0){
                System.out.println("Negative number ignored");
                continue; // skip adding the number
            }

            sum =  sum + number; // add only positive numbers
        }
        System.out.println("The sum of all positive numbers is: " + sum );



    }
}
