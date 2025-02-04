package chapiter6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
        name = "Caty";
        color = "black";
        String finalName = name;
        Consumer<String> consumer = s -> {
            System.out.println(
                    finalName + "says"
            );
            System.out.println(
                    volume + "that she is"
            );
            System.out.println(
                    color
            );
        };
        //volume = "softly";

        Map<String, String> map = new HashMap<>();
        map.forEach((s, s2) -> System.out.println(s.concat(s2)));
    }

    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s-> str.startsWith(s);
    }
}
