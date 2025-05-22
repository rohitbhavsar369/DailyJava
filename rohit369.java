import java.util.Random;

class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        this.threadName = name;
        setName(threadName); // Setting thread name using constructor
        System.out.println("Thread Created: " + getName());
    }

    public void run() {
        Random rand = new Random();
        int sleepTime = rand.nextInt(5000); // random sleep time between 0 and 4999
        try {
            System.out.println("Thread " + getName() + " is going to sleep for " + sleepTime + " ms");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " was interrupted.");
        }
        System.out.println("Thread " + getName() + " has finished execution (Dead).");
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        // Creating threads
        MyThread t1 = new MyThread("Alpha");
        MyThread t2 = new MyThread("Beta");
        MyThread t3 = new MyThread("Gamma");

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
