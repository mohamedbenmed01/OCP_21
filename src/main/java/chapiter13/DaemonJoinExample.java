package chapiter13;

public class DaemonJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread daemonThread = new Thread(() -> {
            try {
                Thread.sleep(3000);  // Simulate some work
                System.out.println("Daemon thread finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        daemonThread.setDaemon(true);  // Set the thread as a daemon thread
        daemonThread.start();

        // Main thread waits for the daemon thread to finish using join()
        daemonThread.join();  // Main thread will wait for daemonThread to finish
        System.out.println("Main program finished");
    }
}

