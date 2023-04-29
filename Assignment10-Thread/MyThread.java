// Purpose: Demonstrate how to create a thread.
public class MyThread extends Thread {
    // Run method
    public void run() {
        // Print message
        System.out.println("Thread is running.");
        
        // Sleep for 1 second
        // This is to simulate a long running task
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print message
        System.out.println("Thread is done.");
    }
    
    // Main method
    public static void main(String[] args) {
        // Create a new thread
        MyThread thread = new MyThread();
        
        // Set the thread name and priority
        thread.setName("MyThread");
        thread.setPriority(Thread.MAX_PRIORITY);
        
        // Check the thread name and priority
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread priority: " + thread.getPriority());
        
        // Check if the thread is a daemon thread
        System.out.println("Is daemon: " + thread.isDaemon());
        
        // Start the thread
        thread.start();
        
        // Check if the thread is alive
        System.out.println("Is alive: " + thread.isAlive());
        
        // Yield the current thread to let the other thread execute
        Thread.yield();
        
        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print message        
        System.out.println("Main thread is done.");
    }
}