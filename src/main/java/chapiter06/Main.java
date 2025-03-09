package chapiter06;

class MyClass {
    static String number = "SuperClass number";  // Static field in superclass
}

class MySubclass extends MyClass {
    static {
        number = "SubClass number";  // Static block modifying static field "number"
    }
}

public class Main {
    public static void main(String[] args) {
        // Force the loading of MySubclass and execution of its static block
        System.out.println(MySubclass.number);   // Accessing the subclass's static field

        // Now access MyClass.number, which shares the same static field
        System.out.println(MyClass.number);      // Accessing the superclass's static field
    }
}

