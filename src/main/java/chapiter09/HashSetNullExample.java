package chapiter09;

import java.util.HashSet;

public class HashSetNullExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements, including null
        set.add("Hello");
        set.add("World");
        set.add(null);

        System.out.println("HashSet: " + set);

        // Trying to add another null value (won't be added)
        set.add(null);

        // Output will show only one null
        System.out.println("HashSet after adding another null: " + set);
    }
}

