//package chapiter06;

public class InheritedStaticFieldExample {
    public static String staticField = "Initialized by InheritedStaticFieldExample";

    public static void main(String[] args) {
        System.out.println(Example2.staticField);
        //System.out.println(Example2.example2StaticField);
    }
}

class Example2 extends InheritedStaticFieldExample {
    public static String example2StaticField = "Initialized by Example2";

    static {
        System.out.println("Static block executed  !!!");
        staticField = "changed By Example2";
    }

    public static void main(String[] args) {
        System.out.println(Example2.staticField);
    }
}
