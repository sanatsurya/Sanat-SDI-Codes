package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String arr[]){
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(15);// Is used to add elements to Queue using linked list
        q1.offer(16);
        q1.offer(17);
        q1.offer(18);
        q1.offer(19);
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
        q1.clear();
        System.out.println(q1);

    }
}
