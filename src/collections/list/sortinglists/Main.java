package collections.list.sortinglists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// String list
		List<String> names = new ArrayList<String>();
		names.add("Youri");
		names.add("Peter");
		names.add("Bram");
		names.add("Ahmet");

		// How to sort a list
		Collections.sort(names);

		// Iteration
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("\n/////////////// ///////////////\n");
		
		// Integer list
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(95);
		numbers.add(1);
		numbers.add(55);
		
		Collections.sort(numbers);
		for(Integer number : numbers) {
			System.out.println(number);
		}
	}
}
