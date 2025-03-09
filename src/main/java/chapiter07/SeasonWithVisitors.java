package chapiter07;

public enum SeasonWithVisitors implements Visitors {
    WINTER("Low") {
        @Override
        String getDescription() {
            return "special description";
        }
    }, SPRING("Medium"), SUMMER("High"), AUTUMN("Medium");

    private final String visitors;

    public static final String DESCRIPTION = "Seasons enum";

    SeasonWithVisitors(String visitors) {
        this.visitors = visitors;
    }

    String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void printVisitors() {
        System.out.println(visitors);
    }
}

