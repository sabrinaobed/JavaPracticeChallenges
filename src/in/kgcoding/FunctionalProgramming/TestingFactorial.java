package in.kgcoding.FunctionalProgramming;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        System.out.println("FACTORIAL USING 2 WAYS");
        int number = 9;
        System.out.println(factorial(number));

        IntStream.rangeClosed(2,number)
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::println);


    }

    public static long factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }

        long fac = 1;
        for (int i = 2; i <= num ; i++) {
            fac*= i;
        }
        return  fac;
    }
}
