package chapiter2;

public class ReviewQuestions {

    public static void main(String[] unsed) {
        /*int sample1 = (2 * 4) % 3;
        int sample2 = 3 * 2 % -3;
        int sample3 = 5 * (1 % 2);
        System.out.println(sample1 + "," + sample2 + "," + sample3);
        System.out.println(Byte.MAX_VALUE);
        int start = (byte)(Byte.MAX_VALUE+1);
        System.out.println(start);*/
        System.out.println("======================");
        int a = 2, b =4 , c =2;
        System.out.println(a>b? --c : b++);
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
        System.out.println("======================");
        System.out.println(b = (a!=c? a : b++));
        System.out.println(b);
        System.out.println("======================");

        b = b++;
        System.out.println(b);
    }
}
