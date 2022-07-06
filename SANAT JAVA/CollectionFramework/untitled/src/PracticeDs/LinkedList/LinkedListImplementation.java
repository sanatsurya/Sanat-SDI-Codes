package PracticeDs.LinkedList;


import org.w3c.dom.Node;

class LinkedList{
    Node head;
    class Node{
        int Data;
        Node head;
        Node next;
        Node(int Data){
            this.Data=Data;
            next = null;
        }
    }
    public void add(int Data){
        Node nd = new Node(Data);
        Node temp = head;
        if(temp==null){
            head = nd;
        }
        else {
            while (temp.next!=null){
                temp= temp.next;
            }
            temp.next =nd;
        }
    }
    public void addFirst(int Data){
        Node nd = new Node(Data);
        nd.next=head.next;
        head=nd;

    }
    public void Display(){
        Node temp = head;
        if(temp==null){
            System.out.println("Linked list is empty");
        }
        else {
            while (temp!=null){
                System.out.print(temp.Data + " ");
                temp= temp.next;
            }
            System.out.println(" ");
        }
    }
    public int size(){
        int count=1;
        Node temp = head;
        while (temp.next!= null){
            count++;
            temp= temp.next;
        }
        return count;
    }
}
public class LinkedListImplementation {
    public static void main(String[]arr){
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        ll.add(11);
        //ll.Display();

        System.out.println(ll.size());
        ll.addFirst(8);
        ll.Display();
        System.out.println(ll.size());
        ll.Display();

    }
}
