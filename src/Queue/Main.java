package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		//Queue data structures --> First In First Out (FIFO)
		//add = enqueue(offer()
		//remove = dequeue(poll())
		//Queue<String> queue=new Queue<String>(); error, because Queue is a interface
		Queue<String> queue=new LinkedList<String>();
		queue.offer("Erva");
		queue.offer("Zümra");
		queue.offer("Hilal");
		System.out.println("\n**********Queue**********");
		System.out.println(queue.isEmpty()); //False
		System.out.println(queue.size());	 //3
		System.out.println(queue.peek());	 //Erva
		System.out.println(queue);
		queue.poll();//Erva out
		System.out.println(queue);
		queue.poll();//Zümra out
		System.out.println(queue);
				
		//PriorityQueue --> Büyükten küçüğe sıralanmış şekilde çalışan bir queue
		Queue<Integer> queue2 =new PriorityQueue<>();
		queue2.offer(50);						 //Collections.reverseOrder
		queue2.offer(10);			
		queue2.offer(30);
		queue2.offer(40);
		queue2.offer(20);
		System.out.println("\n**********PriorityQueue**********");
		while(!queue2.isEmpty()) {
			System.out.println(queue2.poll());
		}
	}

}
