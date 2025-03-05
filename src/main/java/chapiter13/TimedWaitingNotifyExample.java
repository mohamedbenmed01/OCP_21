package chapiter13;

public class TimedWaitingNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        // Thread in TIMED_WAITING (waiting for 5 seconds)
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1 is in TIMED_WAITING state.");
                    lock.wait(5000);  // Will wait for 5 seconds
                    System.out.println("Thread 1 resumed after 5 seconds.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread that notifies (using notify) while the other thread is in TIMED_WAITING
        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 2 calling notify.");
                    lock.notify();  // Notify thread 1, but thread 1 is in TIMED_WAITING, so it will not wake up.
                } catch (IllegalMonitorStateException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        Thread.sleep(1000);  // Ensure thread1 is in waiting state before thread2 calls notify
        thread2.start();
    }
}

