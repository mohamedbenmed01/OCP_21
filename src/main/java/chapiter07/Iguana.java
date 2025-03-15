package chapiter07;

public final record Iguana(int age) implements Visitors{
   // @Override
    public boolean fun() {
        return false;
    }

    @Override
    public void printVisitors() {

    }
}
