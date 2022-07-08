package DATABASEALGO.LinkedList;
//Java programing to create node

import org.w3c.dom.Node;
//Java program to implement
//a Single Linked List
public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next=null;
        }
    }
    //Method to insert a new node
    public static LinkedList insert(LinkedList list,int data){
        Node newnode = new Node(data);
        newnode.next=null;
        //If the linked list is empty
        //Then make the new node as head
        if(list.head==null){
            list.head=newnode;
        }
        else {
            //Else Traverse til the last node and insert the new node there
            Node last = list.head;
            while (last.next!=null){
                last= last.next;
            }
            //Insert the new node at last node
            last.next=newnode;
        }

        return list;
    }
    //Method to Print Linked list
    public static void printList(LinkedList list){
        Node currNode = list.head;
        System.out.print("Linked List:");
        //Traverse through the linked list
        while (currNode!=null){
            //Print the data at current node
            System.out.print(currNode.data+" ");
            //Go to the next node
            currNode = currNode.next;
        }
    }
    //Drive and implement the code
    public static void main(String[] args) {
//        statrt with empty linked list
        LinkedList list = new LinkedList();
        //**********Insertion**************
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,6);
        list = insert(list,7);
        list = insert(list,8);
        list = insert(list,9);
        list = insert(list,10);
        list = insert(list,11);
        printList(list);
    }
}
