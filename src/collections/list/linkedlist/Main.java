package collections.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Main {

	public static void main(String[] args) {

		
		// We are going to compare those two lists
		
		/**
		 * ArrayLists manage arrays internally (inwendig).
		 * [0][2][3][4][5]......
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/**
		 * LinkedLists consists of elements where each element
		 * has a reference to the previous next element
		 * [0]->[1]->[2]...
		 * 	  <-   <-	
		 */
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
	}
	
	private static void doTimings(String type, List<Integer> list ) {
		for(int i = 0; i < list.size(); i++) {
			list.add(i);
		}
		// Start time
		long start = System.currentTimeMillis();
		
		/*
		// Add items at end of list
		for(int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		*/
		
		// Add items elsewhere in list
		for(int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		
		// End time
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " milliseconds for " + type);
	}

}
