package collections;

import java.util.Stack;

public class Stackexample {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		System.out.println(stack.size());
		//System.out.println(stack.peek());
		//System.out.println(stack.pop());
		System.out.println("------------------");
		for(int i=stack.size();i>0;i--) {
		   System.out.println(stack.pop());
		}
		/*Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}
}
