package Stack;
import java.util.Iterator;
import java.util.Stack;
public class ItrateStack {
    public static void main(String[] args) {
        Stack<Integer> s3 = new Stack<>();
        s3.push(1);
        s3.push(2);
        s3.push(4);
        s3.push(5);
        s3.push(6);
        Iterator<Integer> ir = s3.iterator();
        while(ir.hasNext()){
            System.out.println("The value of stack is " + ir.next());
        }
    }
}
