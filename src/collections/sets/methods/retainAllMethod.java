package collections.sets.methods;

import java.util.HashSet;
import java.util.Set;

public class retainAllMethod {
	
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
		
		// Now we check which elements of set2 are the same as set1
		set2.retainAll(set1);
		System.out.println(set2);
	}
}
