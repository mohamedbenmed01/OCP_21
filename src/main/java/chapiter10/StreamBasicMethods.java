package chapiter10;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamBasicMethods {

    public static void main(String... unused) {
        /*Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Optional<String> min1 = s.min((s1, s2) -> s1.length() - s2.length());
        //Optional<String> min2 = s.min(Comparator.comparingInt(String::length)); //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        System.out.println("count" + s.count());
        System.out.println("min1" + min1);
        //System.out.println("min2" + min2);
        */
        String hello = "HELLO WORLD";
        hello.chars()
                .mapToObj(i -> (char) i)
                .forEach(System.out::println);
    }
}
