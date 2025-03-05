package chapiter13;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class InvokeAllExample {
    public static void main(String[] args) {
        List<Future<String>> futures;
        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {

            // create your callables
            Callable<String> callable1 = () -> {
                Thread.sleep(1000);
                return "Done";
            };

            // Store them inside a list
            List<Callable<String>> listOfCallables = List.of(callable1, callable1, callable1);

            // invoke all your callables using invokeAll
            futures = executorService.invokeAll(listOfCallables);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // One way to retrieve the values from your list of Futures
        List<String> stringList = futures.stream().map(f -> {
            try {
                return f.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
        System.out.println(stringList);
    }

}
