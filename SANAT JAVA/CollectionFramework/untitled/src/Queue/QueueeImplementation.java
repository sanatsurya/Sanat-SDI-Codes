package Queue;
class Queue{
    private int front, rear;
    private int capacity;
    static int queue[];
    Queue(int size) {
        this.capacity = size;
        queue = new int[capacity];
    }
    void enqueue(int x){

        if (rear==capacity) {
            System.out.println("Queue is full");
        }
        else
        {
            queue[rear] =x;
            rear++;
        }
    }
    void dequeue(){
        if(rear==0){
            System.out.println("Queue is empty");
        }
        else{
            for(int i = 0; i< rear-1;i++){
                queue[i] = queue[i+1];
            }
            rear--;
        }
    }
    void display(){
        if(rear==0){
            System.out.println("Queue is empty");
        }
        else{
            for (int i=0; i<rear; i++){

                System.out.print(" "+queue[i]);
            }
            System.out.println("");
        }
    }
    void isempty(){
        if(rear==0){
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("There is something in queue");
        }
    }
}
public class QueueeImplementation {
    public static void main(String[] args) {
        Queue q1 = new Queue(4);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.display();
        q1.dequeue();
        q1.display();

    }
}
