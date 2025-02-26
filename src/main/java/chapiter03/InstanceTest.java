package chapiter03;

public class InstanceTest {
    public static void main(String[] args) {
        var v = "Java 17";
        doIt(v);
    }

    public static void doIt(Object o) {
        if (!(o instanceof String v)) { // line n1
            throw new IllegalArgumentException("Must be a string");
        }
        if (!(o instanceof Number u)) { // line n2
            System.out.print("Not a number");
        }
    }

    public static void doItAgain(Object o) {
        if (o instanceof Number v) {
            System.out.print("Number" + v);
            if (o instanceof Integer u) {
                System.out.print("Integer" + u);
            } else {
                System.out.print("Not a Integer" + o);
            }
        } else {
            System.out.print("Not a Number" + o);
            throw new IllegalArgumentException("Must be a Number");
        }
    }
}
