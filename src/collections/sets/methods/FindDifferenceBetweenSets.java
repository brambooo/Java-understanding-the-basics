package collections.sets.methods;

import java.util.HashSet;
import java.util.Set;

public class FindDifferenceBetweenSets {

	public static void main(String[] args) {
		
		// Set 1
		Set<String> set1 = new HashSet<String>();
		set1.add("Bram");
		set1.add("Luuk");
		set1.add("Koen");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("Bram");
		set2.add("Willem");
		set2.add("Koen");
		set2.add("Peter");
		
		// Now we gonna find the difference between set1 and set2
		set2.removeAll(set1);
		System.out.println(set2);
	}
}
