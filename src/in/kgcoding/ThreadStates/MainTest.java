package in.kgcoding.ThreadStates;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        ThraedStateExample t1 = new ThraedStateExample();


        System.out.printf("\nCreated the thread %s",
                t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nThread finished %s",
                t1.getState());
    }
}
