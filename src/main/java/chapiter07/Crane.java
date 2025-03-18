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
    private static int counter = 0;

    public String getName() {
        return "Crane #" + counter++;
    }
}
