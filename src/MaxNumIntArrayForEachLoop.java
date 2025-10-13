import java.util.Scanner;

public class MaxNumIntArrayForEachLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets find Max Number in an integer Array");

        int[] numbers = {1,2,3,4,5};
        int max = numbers[0]; //assume first number is max

        for(int num : numbers){
            if(num > max){
                max = num ;
            }

        }

        System.out.println("The maxium value is: " + max);
    }
}
