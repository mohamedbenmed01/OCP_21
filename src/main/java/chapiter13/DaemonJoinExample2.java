package chapiter13;

public class DaemonJoinExample2 {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            try {
                // Simulating some work that takes longer
                Thread.sleep(5000);
                System.out.println("Daemon thread finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Set the thread as a daemon thread
        daemonThread.setDaemon(true);
        daemonThread.start();

        // Main thread finishes immediately
        System.out.println("Main program finished");
    }
}

