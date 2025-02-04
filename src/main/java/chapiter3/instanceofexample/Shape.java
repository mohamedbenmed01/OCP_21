package chapiter3.instanceofexample;

public interface Shape extends AnoterhInterface {
    public static double getPerimeterIf(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle r) {
            return 2 * r.length() + 2 * r.width();
        } else if (shape instanceof Circle c) {
            return 2 * c.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }

    public static double getPerimeterSwitch(Shape shape) throws IllegalArgumentException {
        int a = 4;
        switch (a) {
            case 2:
                System.out.println(1);
                break;
            case 3:
                System.out.println(2);
                break;
            default:
        }

        String s = "hello";
        switch (s) {
            case "hello":
                System.out.println("Hello");
            case "world":
                System.out.println("World");
            default:
                System.out.println("Default");
        }
        int snake;
        do {
            snake = 0;
        } while (snake < 3);
        return switch (shape) {
            case Rectangle r -> 2 * r.length() + 2 * r.width();
            case Circle c when c.radius > 0 -> {
                System.out.println("test");
                yield 2 * Math.PI;
            }
            default -> throw new IllegalArgumentException("Unrecognized shape");
        };


    }

    public static void main(String[] args) {
        getPerimeterSwitch(new Rectangle(5, 6));
    }

    default double dance(Short speed) {
        return switch (speed) {
            case 5 -> 4;
            case 10 -> 8;
            case 15, 20 -> 12;
            case null -> 16;
            default -> 20;
        };
    }
}

