package stack_dsa;
import java.util.Iterator;
import java.util.Stack;

public class StackSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<>();
		s1.push(2);//Push is used to insert in to a stack
		s1.push(9);
		s1.push(7);
		System.out.println(s1);
		//s1.pop();// pop is used to remove values from stack
		//s1.pop();
		//System.out.println(s1);
		//System.out.println(s1.peek());// This is used to look into last inserted value
		//boolean status = s1.empty();// This is used to check if the stack is empty or not
		//System.out.println(status);
		//int indexValue = s1.search(5);//This is used to the index of a given number
		//System.out.println(indexValue);
		Iterator<Integer> it = s1.iterator();// This is used to over an element
		while(it.hasNext()){
			Object s2 = it.next();
			System.out.println(s2);
		}
		System.out.println();
		System.out.println(s1.size());//s1.size is used to determine the size of an stack
		s1.sort(null);//Used to sort in ascending order
		System.out.println(s1);

	}

}
