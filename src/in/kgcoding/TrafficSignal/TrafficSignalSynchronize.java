package in.kgcoding.TrafficSignal;

import in.kgcoding.ThreeThreadsWithJoinMethod.ThreeThreads;

public class TrafficSignalSynchronize extends Thread {
     private final TrafficLightColors color;

    public TrafficSignalSynchronize(TrafficLightColors color) {
        this.color = color;
    }

    @Override
    public void run() {

        System.out.printf("%s active \n", color);

        try{
            Thread.sleep(color.getTime());
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.printf("%s Inactive \n",color);
    }


}
