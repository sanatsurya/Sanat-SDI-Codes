package Linkedlist;
class Node<I>{
    I data;
    Node next;
    Node(I data){
        this.data= data;
    }
     void travarse(Node head){
        Node cur = head;
        while (cur!= null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
public class LinkListDemo {
    public static void main(String[] args) {
        Node n1 = new Node<>(15);
        Node n2 = new Node<>(20);
        Node n3 = new Node<>(25);
        Node n4 = new Node<>(30);
        Node head = n1;
        n1.next = n2;
        n2.next = n4;
        n4.next = n3;

    }
}
