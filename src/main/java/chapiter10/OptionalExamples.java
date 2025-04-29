package chapiter10;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) throws Throwable {
        Optional<Double> average = average(90, 100);
        average.ifPresent(System.out::println);
        System.out.println(average.orElse(0.0));
        Optional<Double> opt = average();
        System.out.println(opt.get()); // NoSuchElementException
        Optional.ofNullable(null);
        Optional.empty();
        Optional o = Optional.of(1);
        o.isEmpty();
        o.isPresent();
        o.get();
        o.ifPresent(System.out::println);
        o.or(() -> Optional.of(1));
        o.orElse(0);
        o.orElseGet(() -> 1);
        o.orElseThrow();
        o.orElseThrow(Exception::new);

        Double d = Double.NaN;
        Math.random();
        System.out.println(average.orElse(Double.NaN));
        System.out.println(average.orElseGet(() -> Math.random()));
        System.out.println(average.orElseThrow());
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0)
            return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of(sum * 1.0 / scores.length);
    }
}
