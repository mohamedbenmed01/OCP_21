package chapiter13;

import java.util.Date;
import java.util.concurrent.Executors;

public class MissingClose {
    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(1);
        service.submit(() -> System.out.println("Never stops" + new Date(System.currentTimeMillis())));
    }
}