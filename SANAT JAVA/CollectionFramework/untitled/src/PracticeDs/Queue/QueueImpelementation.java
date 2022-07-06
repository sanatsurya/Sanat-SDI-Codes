package PracticeDs.Queue;

interface QueueRule{
        void enQueue(int Data);
        void deQueue();
        int size();
        boolean isEmpty();
        boolean isFull();
        void display();
}
class Queue implements QueueRule{
    private int arr[];
    private int rear;
    private int front;
    private int Capacity;
    Queue(int size){
        this.Capacity=size;
        size = Capacity;
    }
    @Override
    public void enQueue(int Data) {
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            Data = Capacity;
            arr[Capacity]= Data;
            rear++;
        }
    }

    @Override
    public void deQueue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            for (int i = 0; i < rear-1; i++) {
                arr[i]=arr[i+1];
            }
            rear--;
        }
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < Capacity; i++) {
            count++;
        }
        return count;
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
    public void display() {
        for (int i = 0; i < rear; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class QueueImpelementation{
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enQueue(5);
        q1.enQueue(6);
        q1.enQueue(7);
        q1.enQueue(12);
        q1.display();
    }
}
