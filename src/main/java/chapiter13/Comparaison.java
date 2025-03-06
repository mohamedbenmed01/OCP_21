package chapiter13;

import java.util.*;

public class Comparaison {

    public static void main(String[] unused) {
        Object a = null;
        Object b = null;
        System.out.println(a == b);

        Set<String> set = new TreeSet<>();
        set.add("frist");
        set.add(null);
        System.out.println(set);
        List<? super String> list = new ArrayList<CharSequence>();

    }
}
