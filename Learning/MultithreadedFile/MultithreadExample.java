package Learning.MultithreadedFile;

import java.util.ArrayList;
 
/**
 * MultithreadExample
 */
public class MultithreadExample extends Thread {
    public String name;
    public int dataArray[];

    MultithreadExample(String name){
        this.name = name;
    }

    public void dostuff(){
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(" ");
        }
    }

    public void run(){
        System.out.println("Running " + this.name); 
    }

public static void main(String[] args) {
    ArrayList<MultithreadExample> threads = new ArrayList<MultithreadExample>();
    // Create three objects from the MultithreadExample class, each with a different name
    threads.add(new MultithreadExample("Thread 1"));
    threads.add(new MultithreadExample("Thread 2"));
    threads.add(new MultithreadExample("Thread 3"));
    threads.add(new MultithreadExample("Thread 4"));
    threads.add(new MultithreadExample("Thread 5"));
    threads.add(new MultithreadExample("Thread 6"));
    threads.add(new MultithreadExample("Thread 7"));
    threads.add(new MultithreadExample("Thread 8"));
    

    for (MultithreadExample item:threads) {
        item.start();
    }

    // Start the threads

   



}
    

    
}