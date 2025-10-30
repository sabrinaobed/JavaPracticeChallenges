package in.kgcoding.TrafficSignal;

public class SignalTesting {
    public static void main(String[] args) throws InterruptedException {
        TrafficSignalSynchronize red = new TrafficSignalSynchronize(TrafficLightColors.RED);
        TrafficSignalSynchronize yellow = new TrafficSignalSynchronize(TrafficLightColors.YELLOW);
        TrafficSignalSynchronize green = new TrafficSignalSynchronize(TrafficLightColors.GREEN);

        green.start();
        green.join();

        yellow.start();
        yellow.join();

        red.start();
    }
}
