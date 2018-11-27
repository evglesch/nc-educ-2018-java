package main.java.multithreading.synchronization;

public class Preparer implements Runnable {

    PostManager postManager;

    public Preparer(PostManager postManager) {
        this.postManager = postManager;
    }

    @Override
    public void run() {
        postManager.preparePost();
    }
}