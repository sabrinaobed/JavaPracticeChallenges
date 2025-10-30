package in.kgcoding.ExcuteMultipleCallableTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            List<Future<Integer>> list = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                FactorialCal task = new FactorialCal(i);
                list.add(service.submit(task));

            }

            for (Future<Integer> future : list) {
                System.out.printf("\n Result is: %d", future.get());
            }
            service.shutdown();


            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Stop it...");
                service.shutdown();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
