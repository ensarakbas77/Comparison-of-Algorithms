package LinkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		//Create a LinkedList to store doubles
		LinkedList<Double> linkedList=new LinkedList<>();
				
		//Add elements to the LinkedList
		linkedList.add(1.1);
		linkedList.add(2.2);
		linkedList.add(3.3);
		linkedList.add(4.4);
		linkedList.add(5.5);
				
		System.out.println("\n**********LinkedList**********");
		System.out.println(linkedList);
				
		//Remove an element from the LinkedList
		linkedList.removeFirst();
		System.out.println("LinkedList after removing first element: "+linkedList);
				
		//Check if an element exists in the LinkedList
		boolean containsElement=linkedList.contains(5.5);
		System.out.println("LinkedList contains element 5.5? "+containsElement);
				
				
		//Get the first and last elements of the LinkedList 
		double firstElement=linkedList.getFirst();
		double lastElement=linkedList.getLast();
		System.out.println("First element: "+firstElement);
		System.out.println("Last element: "+lastElement);
				
		//Clear the LinkedList
		linkedList.clear();
		System.out.println("LinkedList after clearing: "+linkedList);
				
		//Defining LinkedList in the stack structure 
		LinkedList<String> linkedList2=new LinkedList<String>();
		linkedList2.push("A");
		linkedList2.push("B");
		linkedList2.push("C");
		System.out.println(linkedList2);
		linkedList2.pop();
		System.out.println("LinkedList after removing with pop method: "+linkedList2);
				
	}

}
