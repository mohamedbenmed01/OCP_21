package chapiter13;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);  // Simulate some work
                System.out.println("Thread 1 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);  // Simulate some work
                System.out.println("Thread 2 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        // Main thread waits for both t1 and t2 to finish
        t1.join();  // Main thread waits for thread 1 to finish
        t2.join();  // Main thread waits for thread 2 to finish

        System.out.println("Main program finished");
    }
}


