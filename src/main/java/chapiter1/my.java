package chapiter1;

public abstract class my {
    public void mymethod() {
        System.out.println("ABSTRACT");
    }
 //   abstract void anothermethod() ;
}
class poly {
    public static void main(String arg[]){
        my m = new my() {};
        m.mymethod();
    }
}
