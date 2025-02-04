package chapiter6;

import java.util.Arrays;
import java.util.List;

public class ListOperations {
    public static void main(String[] unused) {
        String[] arr = {"apple", "banana", "cherry"};
        List<String> list = Arrays.asList(arr);

        list.set(0, "orange");  // Modifies the array and list

        System.out.println(list);  // [orange, banana, cherry]
        System.out.println(Arrays.toString(arr));  // [orange, banana, cherry]
        System.out.println("==================================================");
        arr[1] = "pineapple";
        System.out.println(list);  // [orange, pineapple, cherry]
        System.out.println(Arrays.toString(arr));  // [orange, pineapple, cherry]
    }
}
