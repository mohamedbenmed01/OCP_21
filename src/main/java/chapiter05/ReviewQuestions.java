package chapiter05;

public class ReviewQuestions {
}

class Reptile {
    {
        System.out.print("A");
    }

    public Reptile(int hatch) {
    }

    void layEggs() {
        System.out.print("Reptile");
    }
}

class Lizard extends Reptile {
    static {
        System.out.print("B");
    }

    public Lizard(int hatch) {
        super(hatch);
    }

    public final void layEggs() {
        System.out.print("Lizard");
    }

    public static void main(String[] args) {
        var reptile = new Lizard(1);
        reptile.layEggs();
    }
}
