package Java8Features.Java8Baiscs;

import java.util.function.Function;
public class FunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> FetchLenghth = name -> name.length();
        System.out.println("Length of legend is " + FetchLenghth.apply("Legend"));
    }
}
