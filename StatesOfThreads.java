class MyThread extends Thread {
    public void run() {
        try {
            // Thread goes into TIMED_WAITING
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class StatesOfThreads {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        // NEW state
        System.out.println("State after creation: " + t.getState());

        t.start(); // Start the thread

        // RUNNABLE state (might change fast)
        System.out.println("State after start(): " + t.getState());

        Thread.sleep(200); // Give time for t to enter sleep
        System.out.println("State while sleeping: " + t.getState());

        Thread.sleep(1500); // Wait for thread to finish
        System.out.println("Final State: " + t.getState()); // TERMINATED
    }
}
