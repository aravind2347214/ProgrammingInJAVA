import java.util.Random;

class TrafficLight extends Thread {
    private int intersectionId;
    private int greenDuration;
    private int redDuration;
    private volatile boolean isRunning;
    

    public TrafficLight(int intersectionId) {
        this.intersectionId = intersectionId;
        this.greenDuration = 5;  // Random duration between 5 and 15 seconds
        this.redDuration = 3;     // Random duration between 3 and 10 seconds
        this.isRunning = true;
    }

    @Override
    public void run() {
        while (isRunning) {

            setgreen();

            setred();
            // System.out.println("Intersection " + intersectionId + ": Green light is on");
            // sleepInSeconds(greenDuration);

            // System.out.println("Intersection " + intersectionId + ": Red light is on");
            // sleepInSeconds(redDuration);
        }
    }

    public synchronized void setgreen(){
         System.out.println("Intersection " + intersectionId + ": Green light is on");
            sleepInSeconds(greenDuration);

    }

     public synchronized void setred(){
          System.out.println("Intersection " + intersectionId + ": Red light is on");
            sleepInSeconds(redDuration);

    }

    

    public void stopLight() {
        isRunning = false;
    }

    private void sleepInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TrafficSimulation {
    public static void main(String[] args) {
        TrafficLight intersection1 = new TrafficLight(1);
        TrafficLight intersection2 = new TrafficLight(2);

        try {
            intersection1.start();
            intersection2.start();

            // Simulate program running for a certain duration
            Thread.sleep(30000); // 30 seconds

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Stop the simulation and wait for threads to finish
            intersection1.stopLight();
            intersection2.stopLight();
            try {
                intersection1.join();
                intersection2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
