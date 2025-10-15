package in.kgcoding.NestedClassDemo;

import java.lang.reflect.Array;

public class MainTest {
    public static void main(String[] args) {
        int[] data = {4,1,7,2,9,3};

        //use nested class directly using Outerclass.innerclass
        double mean = ArrayOperations.Statistics.mean(data);
        double median = ArrayOperations.Statistics.median(data);

        System.out.println("Array elements: 4,1,7,2,9,3");
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }
}
