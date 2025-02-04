package chapiter3.instanceofexample;

public class Rectangle implements Shape {
    final double length;
    final double width;

    enum Animal {TEST, TEST2, TEST3;}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length() {
        return length;
    }

    double width() {
        return width;
    }
}
