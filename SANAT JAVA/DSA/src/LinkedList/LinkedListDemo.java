package LinkedList;

class LinkedList {
	private Node head;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void addFirst(int data) {
		Node nd = new Node(data);
		Node temp= head;
		temp.next = nd;
		head= nd;
	}

	public void addLast(int data) {
		Node nd = new Node(data);
		Node tmp = head;
		if (head == null) {
			head = nd;
		} else {
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = nd;
		}
	}

	public void removeFirst() {
		head = head.next;
	}

	public void removeLast() {
		Node tmp = head;
		while (tmp.next.next != null) {
			tmp = tmp.next;
		}
		tmp.next = null;
	}

	public int search(int data) {
		Node tmp = head;
		int count = -1;
		if (head == null) {
			System.out.println("Not Found");
			return count;
		}
		while (tmp != null) {
			count++;
			if (tmp.data == data) {
				return count;
			}
			tmp = tmp.next;
		}
		if (tmp == null) {
			System.out.println("Not Found");
		}
		return -1;
	}

	public int size() {
		int count = 1;
		Node tmp = head;
		if (tmp == null) {
			return 0;
		} else {
			while (tmp.next != null) {
				count++;
				tmp = tmp.next;
			}
		}
		return count;
	}

	public void display() {
		Node tmp = head;
		if (head == null) {
			System.out.println("LinkedList is Empty");
			return;
		}
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}
}
public class LinkedListDemo {
	public static void main(String[] arr) {
		LinkedList ll = new LinkedList();
		ll.addFirst(5);
		ll.addFirst(5);
		ll.addFirst(5);
		ll.display();
		
		
	}
}
