package chapiter07;

record Monkey(String name, int age) {
}

public class Zoo {
    public static void main(String[] args) {
        Object animal = new Monkey("George", 3);
        if (animal instanceof Monkey(CharSequence name, int myAge)) {
            System.out.println("Hello " + name);
            System.out.println("Your age is " + myAge);
        }
    }
}
