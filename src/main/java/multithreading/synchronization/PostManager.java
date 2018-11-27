package main.java.multithreading.synchronization;

public class PostManager {

    private boolean ready = false;
    private final Object monitor;

    public PostManager(Object monitor) {
        this.monitor = monitor;
    }

    public void sendPost() {
        synchronized (monitor) {
            System.out.println("Waiting for data...");
            try {
                if (!ready) {
                    monitor.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ready = false;
            System.out.println("Sending data...");
        }
    }

    public void preparePost() {
        synchronized (monitor) {
            System.out.println("Data prepared");
            ready = true;
            monitor.notifyAll();
        }
    }
}