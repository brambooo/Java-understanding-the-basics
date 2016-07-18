package collections.hashset.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// LinkedHashSet remembers the order you added items in.
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("Koen");
		set2.add("Ras");
		set2.add("Bram");
		set2.add("Ras");	// AS you can seen every list can only contain one of the same item!!!

		System.out.println("LinkedHashSet:");
		System.out.println(set2);

		////////////// Iteration //////////////
		System.out.println("\nIteration:");
		for (String str : set2) {
			System.out.println(str);
		}
	}

}
