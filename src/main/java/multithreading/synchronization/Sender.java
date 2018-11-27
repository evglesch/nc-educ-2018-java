package main.java.multithreading.synchronization;

public class Sender implements Runnable {
    PostManager postManager;

    public Sender(PostManager postManager) {
        this.postManager = postManager;
    }

    @Override
    public void run() {
        postManager.sendPost();
    }
}