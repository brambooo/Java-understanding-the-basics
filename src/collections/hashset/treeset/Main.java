package collections.hashset.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// TreeSet sorts in natural order
		Set<String> set3 = new TreeSet<String>();
		set3.add("Willem");
		set3.add("Bram");
		set3.add("Ahmet");
		set3.add("Jeffrey");

		System.out.println("TreeSet:");
		System.out.println(set3);

		/////////// Iteration ///////////
		System.out.println("\nIteration:");
		for (String element : set3) {
			System.out.println(element);
		}
		
		// Some methods
		
		/////////// Does set contain a given item ///////////
		// How find a element in a set!!!
		if(set3.contains("Bram")) {
			System.out.println("Set contains element: Bram" );
		}
		
		if( set3.isEmpty() ) {
			System.out.println("Set is empty");
		} else {
			System.out.println("Set is not empty");
		}

	}

}
