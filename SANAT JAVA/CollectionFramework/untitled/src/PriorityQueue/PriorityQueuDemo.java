package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuDemo {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(455);
        q1.add(75);
        q1.add(98);
        q1.add(24);
        q1.add(1);
        q1.add(789);
        q1.add(87);
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());//It will reverse the previous ordering system
        pq.add(95);
        pq.add(75);
        pq.add(48);
        pq.add(69);
        pq.add(7);
        pq.add(4578);
        System.out.println(pq);
        pq.remove();
        System.out.println( "This will remove next " +pq.peek());
        System.out.println(pq);
        System.out.println("is 77is present or not"+pq.contains(77));

    }
}
