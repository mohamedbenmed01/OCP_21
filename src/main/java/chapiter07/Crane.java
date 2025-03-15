package chapiter07;

public record Crane(int numberEggs, String name) implements IsColdBlooded {
    public Crane {

    }

    @Override
    public boolean hasScales() {
        return false;
    }

    @Override
    public double getTemperature() {
        return 0;
    }
}
