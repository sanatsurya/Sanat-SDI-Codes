package LinkedListImplementation;

import org.w3c.dom.Node;

class LinkedList{
    Node head;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            next = null;
        }
    }


    public void addFirst(int Data){
        Node nd = new Node(Data);
        Node temp = head;
        if(temp==null){
            head = nd;
        }
        else{
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next= nd;
        }
    }
    public void addLast(int Data){
        Node nd = new Node(Data);
        Node temp = head;
        if(head==null){
            head = nd;
        }
        else {
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = nd;
        }
    }
    public void removeFirst(){
        head = head.next;
    }
    public void removeLast(){
        Node temp = head;
        while (temp.next.next!= null){
            temp = temp.next;
        }
        temp.next=null;
    }
    public int Size(){
        int count = 1;
        Node temp= head;
        if(temp==null){
            return 0;
        }
        else {
            while (temp.next!= null){
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    public void Display(){
        Node temp = head;
        if(temp==null){
            System.out.println("Linked list is empty");
        }
        else {
            while (temp!=null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
            System.out.println(" ");
        }
    }

}
public class LinkedListImplementation {
    public static void main(String[] arr){
        LinkedList l1 = new LinkedList();
        l1.addFirst(5);
        l1.addFirst(10);
        l1.addFirst(15);
        l1.addFirst(20);
        l1.addFirst(25);
        l1.addFirst(30);
        l1.addFirst(40);
        l1.addFirst(50);
        l1.addFirst(60);
        l1.Display();
        System.out.println(l1.Size());
        l1.removeLast();//This is used to delete last element
        l1.Display();
        l1.removeFirst();
        l1.Display();
        l1.addLast(80);
        l1.Display();

        System.out.println(l1.Size());

    }
}




