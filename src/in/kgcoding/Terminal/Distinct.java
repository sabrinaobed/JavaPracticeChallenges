package in.kgcoding.Terminal;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,2,3,4,5);
        List<Integer>distinctNumbers =numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distinctNumbers);

    }
}
