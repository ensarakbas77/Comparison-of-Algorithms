package Stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		//Stack data structures --> First In Last Out (FILO)
		  					 	 // or Last In First Out (LIFO)  
		//Stack have two method --> pop() and push() and peek()
		
		//I'm created a instance of Stack Class
		Stack<String> stack=new Stack<String>();
		stack.push("Ensar"); 	//First
		stack.push("Erva");		//Second
		stack.push("Muhammed");	//Third

		System.out.println("**********Stack**********");
		System.out.println("Is the stack empty? "+stack.isEmpty());
		System.out.println("My stack is: "+stack);
		System.out.println("The top element in the stack: "+stack.peek());
		stack.pop(); //Muhammed is popped
		System.out.println("After the first removing "+stack);
		stack.pop(); //Erva is popped
		System.out.println("After the second removing: "+stack);
		System.out.println("Is this element in the stack: "+stack.search("Ensar"));
		
	}

}
