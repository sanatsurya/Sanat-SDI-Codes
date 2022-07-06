package MethordRefenrence;

public class MethordRefereceDemo {
    public static void main(String[] args) {
        MethordRefereceDemo MrObj = new MethordRefereceDemo();
        CalculateSquare cs = (x)-> x*x;
        System.out.println(cs.Square(5));
        CalculateSquare cs2 = MrObj ::Squarevalue;//Method Reference
        System.out.println(cs2.Square(5));

    }
    interface CalculateSquare{
        int Square(int x);
    }
    int Squarevalue(int x){
        return x*x;
    }

}
