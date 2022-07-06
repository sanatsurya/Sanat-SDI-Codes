package Queue;
interface QueueRule{
    void enQueue(int value);
    void deQueue();
    boolean isEmpty();
    boolean isFull();
    void Display();
}
class Queue1 implements QueueRule{
    private int arr[];
    private int front,rear;
    private int Capacity;

    Queue1(int size){
        size=Capacity;
    }
    @Override
    public void enQueue (int value) {
        if(isFull()){
            System.out.println("Array is full");
        }
        else{
            value= Capacity;
            arr[Capacity]=value;
            rear++;
        }
    }

    @Override
    public void deQueue() {
        if(isEmpty()){
            for (int i = 0; i < rear-1; i++) {
                arr[i]=arr[i+1];
            }
            rear--;
        }
    }

    @Override
    public boolean isEmpty() {
        return rear==0;
    }

    @Override
    public boolean isFull() {
        return rear==Capacity-1;
    }

    @Override
    public void Display() {
        for (int i = 0; i <= rear; i++) {
            System.out.println(" "+arr[i]);
        }
    }
}
public class QueueImplementation {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enqueue(5);
        q1.enqueue(6);
        q1.enqueue(7);
        q1.enqueue(8);
        q1.display();
        q1.dequeue();
        q1.display();

    }
}
