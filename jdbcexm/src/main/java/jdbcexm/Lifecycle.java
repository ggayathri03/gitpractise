package jdbcexm;

public class Lifecycle {


    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000); // TIMED_WAITING
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread finished.");
        });

        // State: NEW
        System.out.println("State after creation: " + t.getState());

        t.start(); // State changes to RUNNABLE
        System.out.println("State after start: " + t.getState());

        Thread.sleep(100); // Give time for thread to start
        System.out.println("State while sleeping: " + t.getState());

        t.join(); // Wait for thread to finish
        System.out.println("State after completion: " + t.getState());
    }

}
