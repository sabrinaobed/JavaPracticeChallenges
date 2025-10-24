import java.util.Scanner;

public class SumAndAverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //ask the user for array size
        System.out.print("Enter the number of elements: ");
        int sizeOfArray = input.nextInt();

        //create an array of given size
        int[] numbers = new int[sizeOfArray];

        //input the elements from user
        System.out.println("Enter " + sizeOfArray + " numbers:");
        for(int i = 0; i < sizeOfArray; i++){
            numbers[i] = input.nextInt();
        }

        //calculate sum
        int sum = 0;
        for(int num :numbers){
            sum = sum + num;
        }

        //calculate average
        double average = (double) sum / sizeOfArray;

        //display results
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
