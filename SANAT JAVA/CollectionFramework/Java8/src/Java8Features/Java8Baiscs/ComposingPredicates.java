package Java8Features.Java8Baiscs;

import java.util.function.Predicate;

public class ComposingPredicates {
    public static void main(String[] args) {
        Predicate<String> iscontainsa = string-> string.contains("a");
        Predicate<String> iscontainse = s -> s.contains("e");
        System.out.println("Is World contains a " + iscontainsa.test("World"));
//        System.out.println("Is Earth contains a " + iscontainsa.test("Earth"));
//        System.out.println("Is Venus contains a " + iscontainsa.test("Venus"));
//        System.out.println("Is Venus contains e " + iscontainse.test("Venus"));
        Predicate<String> startaswandene = (input) ->iscontainsa.test(input)&&iscontainse.test(input);
        String tag ="Is this word contains me";
        Boolean result = startaswandene.test(tag);
        System.out.println("Is contains a and E" +result);

    }
}
