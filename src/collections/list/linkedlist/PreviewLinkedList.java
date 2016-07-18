package collections.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class PreviewLinkedList {
	
	public static void main(String[] args) {
		
		// Attributes
		List<String> names = new LinkedList<String>();
		names.add("Bram");
		names.add("Koen");
		names.add("Nel");
		names.add("Ras");
		
		// On this way we can add a new item at index zero or something
		// this .add() method has two parameters:
		// parameter 1: the index number where you want to add a new item
		// parameter 2: contains the name you like to add.
		names.add(0, "Luke");
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
