class Stack{
    private int top;
    private static int stack[];
    Stack(int size){
        stack = new int[size];
    }
    public void push(int num){
        top++;
        stack[top] = num;
    }
    public void  pop(){
        if(top == -1)
            System.out.println("Stack is empty");
        else
            top--;
    }
    public int peek(){
        return stack[top];
    }
}
public class StackDemo {
    public static void main (String [] args){
        Stack st1 = new Stack(8);
        st1.push(5);
        st1.push(8);
        st1.push(9);
        System.out.println(st1.peek());
    }
}
