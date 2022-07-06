interface Stack1{
    void push(int value);
    void pop() throws Exception;
    boolean isEmpty();
    boolean isFull();
    void clear();
    void display();
}
class stackl implements Stack1{
    private int top = 0;
    private int arr[];
    private int capacity =5;

    @Override
    public void push(int value) {
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        else{
            arr[top++] = value;
            System.out.println("Inserted element is" + value);
        }
    }

    @Override
    public void pop() throws Exception {
        if(isEmpty()){
            throw new Exception("The Stack is empty nothing to remove");
        }
        else {
            top--;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity-1;
    }

    @Override
    public void clear() {

    }

    @Override
    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i]);
        }
    }
    public stackl(){
        this.arr = new int[capacity];
    }

}
public class StackImplementation extends stackl{
    public static void main(String[] args) throws Exception {
        stackl s1 = new stackl();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.display();
        s1.pop();
        System.out.println(" ");
        s1.display();
    }

}
