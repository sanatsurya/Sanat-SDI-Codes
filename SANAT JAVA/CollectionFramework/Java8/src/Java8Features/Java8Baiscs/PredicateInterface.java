package Java8Features.Java8Baiscs;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<String> islenght5 = string-> string.length()==5;
        System.out.println("Is sanat contains five letters " + islenght5.test("sanat"));
        System.out.println("Is Arbinda contains five letters " + islenght5.test("Arbinda"));
        System.out.println("Is Bhupen contains five letters " + islenght5.test("Bhupen"));
    }
}
