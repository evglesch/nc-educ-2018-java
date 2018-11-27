package main.java.multithreading.synchronization;

public class Incrementer {

    int value = -1;

    public synchronized void incrementSync() {
        value++;
        System.out.println(Thread.currentThread().getName() + ": " + value);
    }

    public void increment() {
        value++;
        System.out.println(Thread.currentThread().getName() + ": " + value);
    }

}