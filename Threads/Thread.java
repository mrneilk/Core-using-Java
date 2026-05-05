class MyThread extends Thread {
    public void run() {
        // The code that runs in a separate thread
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Initiates the new thread
    }
}
