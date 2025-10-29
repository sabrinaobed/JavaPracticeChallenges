package in.kgcoding.Frequency;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,7,5,4,5,5);
        System.out.println(Collections.frequency(list,4));
        System.out.println(Collections.frequency(list,5));
        System.out.println(Collections.frequency(list,1));
    }
}
