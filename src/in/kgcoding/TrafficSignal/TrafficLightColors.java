package in.kgcoding.TrafficSignal;

public enum TrafficLightColors {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int time;

    TrafficLightColors(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
