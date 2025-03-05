package chapiter09;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(123);
        List<Number> numbers = new ArrayList<Number>(integers);
        addSound(integers);
        addSound(numbers);
    }

    static void addSound(List<? super Integer> list) {
        list.add(4444);
    }

    class genericExample<S> {
        <T> S first(List<? extends T> list) {
            return (S) list.get(0);
        }

        <T> void fourth(List<? super T> list) {}
    }
}
