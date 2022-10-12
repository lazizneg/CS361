/**
 * 
 */
package mystack;

/**
 * @author lazizjon negmatullaev
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		//return null;
		T popExample = theStack.val;
		theStack = theStack.next;
		return popExample;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> st = new MyStack<Integer>();
		st.push(1);
		st.push(2);
		st.pop();
		st.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		Person p1 = new Person("Lazizjon", "Negmatullaev");
		Person p2 = new Person("Christelle", "Scharff");
		MyStack<Person> mp = new MyStack<Person>();
		mp.push(p1);
		mp.push(p2);
	}
}