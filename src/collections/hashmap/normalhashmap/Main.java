package collections.hashmap.normalhashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * HashMap contains two parameters
		 * parameter 1: Key item
		 * parameter 2: the object you like to store.
		 */
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(4, "Four");
		
		// Get a object by key number
		String text = map.get(5);
		System.out.println(text);
		
		// Trying to find a value by a key number that doesn't exist
		System.out.println(map.get(12));
		
		// Now we trying to add a new key with a key number that already exists
		// what happens is that the old item gets overriden by the new one.
		//map.put(1, "Bram");
		System.out.println(map.get(1));
		
		// Loop due a HashMap
		for( Map.Entry<Integer, String> entry : map.entrySet() ) {
			
			// Get the key of a HashMap item
			int key = entry.getKey();
			
			// get the value of a HashMap item
			String value = entry.getValue();
			System.out.println("Key: " + key + " value " + value);
		}
	}

}
