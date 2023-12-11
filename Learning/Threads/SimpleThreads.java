package Learning.Threads;
public class SimpleThreads {
    static void threadMessage(String message){
        String threadName =Thread.currentThread().getName();
        System.out.format("%s : %s%n",threadName,message);
    }
    private static class MessageLoop implements Runnable {
        public void run(){
            String importantInfo[]={
                "Mares eat oats",
                "does eat oats",
                "Little Lamb eats ivy",
                "A kid will eat ivy too"
            };
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(importantInfo[i]);  
                }
                
            } catch (InterruptedException e) {
                // TODO: handle exception
                threadMessage("It wasnt done!");
            }
        } 
    }
    public static void main(String[] args) throws InterruptedException {
        long patience = 1000 * 60 * 60;
        if(args.length>0){
            try{
                patience = Long.parseLong(args[0])*1000;
            }
            catch(NumberFormatException e){
                System.err.println("Argument must be integer");
                System.exit(1);
            }
        }
        threadMessage("Starting Message Loop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for Message thread to finish");
        while (t.isAlive()) {
            threadMessage("Still Waiting...");
            t.join(1000);
            if(((System.currentTimeMillis()-startTime)>patience)&&t.isAlive()){
                threadMessage("Tired of Waiting");
                t.interrupt();
                t.join();
            }   
        }
        threadMessage("Finally");       
    } 
}