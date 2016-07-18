package queues;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public static void main(String[] args) {
		
		// (head) <- 0000000000000000000 <- (tail) FIFO principe (first in, first out)
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);	// let say the queue can have maximum 3 items
		
		q1.add(10);
		q1.add(15);
		q1.add(20);
		try {
			q1.add(25);
		} catch (Exception e) {
			System.out.println("Tried to add too many items to the queue.");
		}
		
		// Queue before removed item:
		System.out.println("Queue before removed item:");
		iterateQueue(q1);
		
		// Remove first item from queue
		q1.remove();
		q1.add(25);
		
		// Queue after removed item:
		System.out.println("\nQueue after removed item:");
		iterateQueue(q1);
		
		// Get first item (head) of queue
		System.out.println( "head of the queue is now : " + q1.element() );
		
		
		
		
		//////////////////////////////////////////////////////
		
		
		
		
		System.out.println("\n////////// Example 2 //////////");
		Integer thirdQueueItem = 30;
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);	// let say the queue can have maximum 2 items
		
		q2.offer(10);
		q2.offer(20);
		// Last item isn't added now and no error!
		if( q2.offer(thirdQueueItem) == false) {
			System.out.println("Offer failed to add third item: " + thirdQueueItem );
		}
		
		for(Integer queue : q2) {
			System.out.println(queue);
		}
			
	}
	
	// Methods
	public static void iterateQueue(Queue<Integer> q1) {
		for(Integer value :  q1) {
			System.out.println("Queue value: " + value);
		}
	}

}
