import java.util.Arrays;
import java.util.Scanner;

public class OccurencesOfAnElementInArrayForEachLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {1,2,4,5,6,3,6,2,7,8,8,7,8,8,3,2};
        System.out.println("Lets see the occurences of an element in the following array");
        System.out.println(Arrays.toString(numbers));
        System.out.print("Enter the number you want to count: ");
        int numWantToCount = input.nextInt();
        int count = 0;

        for(int num: numbers){
            if(num == numWantToCount){
                count++;
            }
        }
        System.out.println("The number " + numWantToCount + " appears " + count + " times in this array.");






    }
}
