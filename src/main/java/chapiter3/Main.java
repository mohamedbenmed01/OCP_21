package chapiter3;

public class Main {
    public static void main(String[] args) {
        Number tickets = 5.5f;
        if (tickets instanceof Float i && i%3==2) {
            System.out.println("Tickets sold: " + i);
        } else {
            System.out.println("not instance of type");
        }
        Long a = (long)4;
       // Integer b = 4.0f;
    }

}
