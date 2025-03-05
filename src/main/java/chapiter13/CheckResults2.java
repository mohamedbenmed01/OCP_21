package chapiter13;

import java.util.concurrent.*;

public class CheckResults2 {
    private static int counter = 0;

    public static void main(String[] unused) throws Exception {
        try (var service = Executors.newSingleThreadExecutor()) {
            //Future<?> result = service.submit(getCallableTask());
            //Future<?> result = service.submit(getRunnableTask());
            //System.out.println(result.get(5, TimeUnit.SECONDS));// Returns null for Runnable && Integer for Callable

            service.execute(getCommand());
            System.out.println("Reached!");
        }/* catch (TimeoutException e) {
            System.out.println("Not reached in time");
        }*/
    }

    private static Runnable getCommand() {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
        };
    }

    private static Runnable getRunnableTask() {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
        };
    }

    private static Callable<Integer> getCallableTask() {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
            return counter;
        };
    }
}
