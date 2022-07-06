package FunctionalInterface;
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        DemoFunction2 d2 = new DemoFunction2();
        d2.print();

    }
    @FunctionalInterface
    static  interface DemoFunction{
        void print();//This is known as functional interface having one abstract method
        // It is by default public abstract
    }
    static class DemoFunction2 implements DemoFunction{

        @Override
        public void print() {
            System.out.println("The Line is printed here and this is functionalInterface Program");
        }
    }

}
