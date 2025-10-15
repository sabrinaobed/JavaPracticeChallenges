package in.kgcoding.NestedClassDemo;

public class ArrayOperations {

    //Static nested class
    public static class Statistics{
        //Method to calculate mean(average)
        public static double mean(int[] numbers){
            if(numbers == null || numbers.length == 0){
                throw new IllegalArgumentException("Array is empty or null");
            }
            double sum = 0;
            for(int num : numbers){
                sum =  sum + num;
            }
            return sum/ numbers.length;
        }

        //Method to calculate median(middle value)
        public static double median(int[] numbers){
            if(numbers == null || numbers.length == 0){
                throw new IllegalArgumentException("Array is empty or null");
            }
            //make a copy so we don't modify the original
            int[] sorted = numbers.clone();
            java.util.Arrays.sort(sorted);

            int n = sorted.length;
            if(n % 2 == 0){
                //even length -> average of two middle elements
                return (sorted[n/2 -1] + sorted[n/2]) /2.0;

            }else{
                //odd length -> middle element
                return sorted[n/2];
            }
        }
    }
}
