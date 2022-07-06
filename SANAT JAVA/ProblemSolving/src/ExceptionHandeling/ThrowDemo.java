package ExceptionHandeling;

public class ThrowDemo {
    public static void DividebyZero(){
        throw new ArithmeticException("The error is for divided by zero");
    }
    public static void main(String[] args) {
        DividebyZero();
    }
}
