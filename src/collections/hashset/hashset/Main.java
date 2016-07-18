package collections.hashset.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// HashSet does not retain order.
		Set<String> set1 = new HashSet<String>();
		set1.add("Dog");
		set1.add("Cat");
		set1.add("Tiger");
		set1.add("Snape");
		
		// If i try to add a item like Dog again that already exists, it just override the element
		set1.add("Dog");
		
		System.out.println("HashSet:");
		System.out.println(set1);
		
		////////////// Iteration //////////////
		System.out.println("Iteration:");
		for(String str : set1) {
			System.out.println(str);
		}
	
	}
}
