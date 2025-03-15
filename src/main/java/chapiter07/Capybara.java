package chapiter07;

class Rodent {
}

public class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        if (rodent instanceof Capybara c) {
            var capybara = (Capybara) c;
        }
    }
}
