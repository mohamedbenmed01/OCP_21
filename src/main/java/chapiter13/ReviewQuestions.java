package chapiter13;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReviewQuestions {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        var set = Set.of(1, 2, 3);
        var map = Map.of(1, 2, 3, 4);
        list.forEach(System.out::println);
    }
    public CharSequence getString() {
        return null;
    }

    class ReviewQuestionsInnerClass extends ReviewQuestions {
        public String getString() {
            return null;
        }
    }
}
