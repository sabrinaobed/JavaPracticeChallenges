package in.kgcoding.FunctionalInterface;

public class Test {
    public static void main(String[] args) {
        SingleAbstractMethod candidate = num -> {
            for (int i = 2; i < num; i++) {
               if(num % i == 0){
                   return false;
               }
            }
            return true;
        };


        System.out.println(candidate.isCandiate(12));
    }
}
