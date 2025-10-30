package in.kgcoding.ThreeThreadsWithJoinMethod;

public class TestingJoin {
    public static void main(String[] args)throws InterruptedException {
        ThreeThreads t1 = new ThreeThreads(1);
        ThreeThreads t2 = new ThreeThreads(2);
        ThreeThreads t3 = new ThreeThreads(3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();




    }
}
