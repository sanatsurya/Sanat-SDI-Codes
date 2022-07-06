package Stack;

class Stack{
    private int top =-1;
    private static int stack[];
    Stack(int size){
        stack = new int[size];
    }
    public void push(int data){
        top++;
        stack[top] = data;
    }
    public void pop(){
        if (top == -1){
            System.out.println("Stack is empty");
        }
        top--;
    }
    public int peek(){

        return stack[top];
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack s1 = new Stack(6);
        s1.push(15);
        s1.push(18);
        s1.push(19);
        s1.push(9);
        s1.pop();
        System.out.println(s1.peek());
    }
}
