package chapiter13;

public class Zoo {
    public static void pause() {
        try{
            Thread.sleep(10_000); // Wait for 10 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] unused) throws InterruptedException {
        var job = Thread.ofPlatform().daemon(true).start(Zoo::pause);
        System.out.println(job.isDaemon());
        System.out.println("Main method finished");
        job.join();
    }
}
