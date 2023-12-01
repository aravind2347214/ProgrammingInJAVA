package Learning.Threads;
public class ThreadInterruptExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                // Simulate some work
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // Handle interruption if needed
                System.out.println("Thread interrupted while sleeping");
            }
        });

        myThread.start();

        // Interrupt the thread after a delay
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();

        // Check if the current thread is interrupted and clear the interrupted status
        boolean interruptedStatus = Thread.interrupted();

        // Output the results
        System.out.println("Thread interrupted status: " + interruptedStatus);
    }
}