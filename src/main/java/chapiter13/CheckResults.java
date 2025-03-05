package chapiter13;

import java.util.concurrent.*;

public class CheckResults implements Callable<Integer> {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newSingleThreadExecutor()){
            Future<Integer> future = service.submit(new CheckResults());
            while (!future.isDone()) {
                System.out.println("state: " + future.state());
                //System.out.println("result now: "  +future.resultNow());
                System.out.println("get: "  + future.get(15_000, TimeUnit.MILLISECONDS));
            }
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer call() throws Exception {
        int result = 0;
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10_000; i++) {
            result+=i;
        }
        return result;
    }
}
