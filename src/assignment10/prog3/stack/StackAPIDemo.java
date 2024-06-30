package assignment10.prog3.stack;
import java.util.Stack;
import java.util.Vector;;
public class StackAPIDemo {

	public static void main(String[] args) {
		// Demo with Stack Methods
		Stack<String> obj = new Stack<>();
		obj.push("Java");
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Integer Stack");
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println(stack);
		System.out.println("Size of the Stack :" + stack.size() + "\nCapacity = " + stack.capacity());
		System.out.println("Get index : " + stack.get(2));
		System.out.println("Top Element : " + stack.peek()); 
		stack.pop();
		System.out.println("Element of stack : " + stack);
		System.out.println("String Array");


	}
	
}
