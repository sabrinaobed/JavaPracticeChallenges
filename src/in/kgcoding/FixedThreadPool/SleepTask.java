package in.kgcoding.FixedThreadPool;

public class SleepTask implements  Runnable {

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread %s\n", current.getName());
        try {

            Thread.sleep(randomNum() * 1000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.printf("Ended with Thread %s\n", current.getName());

    }

    private int randomNum() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }

}
