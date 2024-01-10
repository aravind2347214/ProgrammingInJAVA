package Learning.MultithreadedFile;

class SharedResource {
    private boolean flag = false;
    private int data;

    // Producer method to produce data
    public synchronized void produce(int newData) {
        // Wait until the consumer consumes the previous data
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Produce data
        data = newData;
        System.out.println("Produced: " + data);

        // Set the flag to indicate that data is ready for consumption
        flag = true;

        // Notify the waiting consumer
        // notify();
    }

    // Consumer method to consume data
    public synchronized void consume() {
        // Wait until the producer produces data
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Consume data
        

            System.out.println("Consumed: " + data);
            flag = false;
        
    
        // Set the flag to indicate that the consumer has consumed the data

        // Notify the waiting producer
        // notify();
    }
}

class Producer extends Thread {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.produce(i);
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.consume();
        }
    }
}

public class ITCExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Producer producerThread = new Producer(sharedResource);
        Consumer consumerThread = new Consumer(sharedResource);

        producerThread.start();
        consumerThread.start();
    }
}
