package chapiter13;

import java.util.ArrayList;
import static java.util.Arrays.*;

public class Main {
    private static final String bench;
    public static void main(String[] args){
        final var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>(list1);
        var list3 = new ArrayList<String>(10);
        System.out.println(list3.get(5));
    }

    final static String example = "3";
}
