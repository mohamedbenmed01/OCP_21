package chapiter01;

public class Main {

    public static final String example;
    static {
        example = "Lizard";
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.printMessage(3);
        main.printMessage(3, 3);
        String ex;
        System.out.println("Lizard");
    }

    // Ambiguous call
    public void printMessage(int message) {
        int ex;
        System.out.println(message);
    }

    public void printMessage(int... message) {

        System.out.println("Varargs method");
    }
}
