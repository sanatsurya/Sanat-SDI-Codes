package ExceptionHandeling;

public class FinalyBlockDemo {
    public static void main(String[] args) {
        int num= 5;
        try{
            int div = num/0;
            System.out.println("solution is" + div);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is "+e.getMessage());
        }finally {
            System.out.println("This is final block");
        }
    }
}
