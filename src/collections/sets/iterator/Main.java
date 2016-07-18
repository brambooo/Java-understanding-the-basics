package collections.sets.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		names.add("Bram");
		names.add("Ahmet");
		names.add("Jeffrey");
		
		Iterator<String> it = names.iterator();
		
		// Get first item in the list
		//System.out.println( it.next() );
		
		// Now we get the second item in the list, so we can go on...
		//System.out.println(it.next());
		
		System.out.println("Iterating due list: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for()
		
		// Find a item in a list
//		while(it.hasNext()) {
//			String value = it.next();
//			if(value.equals("Jeffrey")) {
//				System.out.println(value);
//			}
//		}
		
		// Remove a item in a list
//		while(it.hasNext()) {
//			String value = it.next();
//			System.out.println(value);
//			
//			if(value.equals("Bram")) {
//				it.remove();
//			}
//		}
//		
//		System.out.println("\nIterating due list: ");
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
	}

}
