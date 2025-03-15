package chapiter07;

public interface IsColdBlooded {

    boolean hasScales();

    double getTemperature();

    default double getHumidity() {
        return 5.0;
    }

    private double getPressure() {
        return 5.0;
    }

    static boolean isColdBlooded() {
        return true;
    }

    private static int computeLifeExpectency() {
        return 20;
    }
}

class Example implements IsColdBlooded {

    @Override
    public boolean hasScales() {
        return false;
    }

    @Override
    public double getTemperature() {
        return 0;
    }

    public static void test() {
        System.out.println(IsColdBlooded.isColdBlooded());
    }
}