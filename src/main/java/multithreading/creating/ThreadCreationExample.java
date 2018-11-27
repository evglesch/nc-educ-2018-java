package main.java.multithreading.creating;

public class ThreadCreationExample {

    class MyThreadInstance extends Thread {

        @Override
        public void run() {
            System.out.println(getName());
        }
    }

    public void showThreadDemo() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread threadInstance = new MyThreadInstance();
            threadInstance.start();
            threadInstance.join();
        }
        System.out.println(Thread.currentThread().getName());
    }

    // -------------------------------------------

    class MyRunnableInstance implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public void showRunnableDemo() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyRunnableInstance());
            thread.start();
            thread.join();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
