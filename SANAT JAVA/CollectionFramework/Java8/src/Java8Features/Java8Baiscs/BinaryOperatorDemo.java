package Java8Features.Java8Baiscs;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a,b)->a+b;
        System.out.println("Addition of 100 and 201");
    }
}
