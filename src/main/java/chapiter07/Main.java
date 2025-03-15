package chapiter07;

public class Main {

    public static void main(String[] args) {

    }

    public String getType(Fish fish) {
        return switch (fish) {
            case Trout t -> "Trout";
            case Bass b -> "Bass";
        };
    }

    /*public String getType(Fish fish) {
        return switch (fish) {
            case Trout t -> "Trout";
            case Bass b -> "Bass";
            default -> "Object";
        };
    }*/
}
