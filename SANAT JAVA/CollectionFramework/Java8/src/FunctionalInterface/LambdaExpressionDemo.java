package FunctionalInterface;
interface LambdaString{
    void print();
}
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        LambdaString l1 = ()-> System.out.println("Print the stuff using Lambda Expression");
        l1.print();
        LambdaInt l2 = (a,b)-> a+b;
        System.out.println(l2.add(8,9));
        }
        interface LambdaInt{
            int add(int a, int b);
        }
    }

