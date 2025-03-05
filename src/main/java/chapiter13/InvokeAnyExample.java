package chapiter13;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class InvokeAnyExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = newFixedThreadPool(5);

        // Create your callables
        Callable<String> callable1 = () -> {
            Thread.sleep(1000);
            return "Done";
        };

        // Store them inside a list
        List<Callable<String>> listOfCallables = List.of(callable1, callable1, callable1);

        // Submit all your callables using invokeAll
        String result = executorService.invokeAny(listOfCallables);

        System.out.println(result);
    }

}
