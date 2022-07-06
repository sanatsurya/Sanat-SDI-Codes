package Linkedlist;

import org.w3c.dom.Node;

class LinkedList {
    private Node head;



    private class Node {
        int data;
        Node next;



        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    public void add(int data) {
        Node nd = new Node(data);
        if (head == null) {
            head = nd;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = nd;
        }
    }



    public void add(int index, int data) {
        Node nd = new Node(data);
        int count = 0;
        Node tmp = head;
        if(index==0) {
            nd.next=head;
            head=nd;
        }
        else {
            while(count<index) {
                count++;
                if(count==index) {
                    nd.next=tmp.next;
                    tmp.next=nd;
                    break;
                }
                tmp=tmp.next;
            }

        }
    }
    public void set(int index,int data) {
        int count=0;
        Node tmp=head;
        if(index==0) {
            head.data=data;
        }
        else {
            while(count<index) {
                count++;
                tmp=tmp.next;
            }
            tmp.data=data;
        }
    }
    public int size() {
        int count=0;
        Node tmp=head;
        while(tmp!=null) {
            count++;
            tmp=tmp.next;
        }
        return count;
    }



    public void display() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "=>");
            tmp = tmp.next;
        }
        System.out.println();



    }



}



public class LinkedListDemo {
    public static void main(String[] arr) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(5,999);
        l1.display();
        l1.set(5, 0);
        System.out.println(l1.size());
        l1.display();
    }
}