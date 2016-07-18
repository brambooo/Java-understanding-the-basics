package collections.arraylist;

import java.util.List;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		// Declare and initialize at once
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Declare
		ArrayList<String> names;
		//Initialize
		names = new ArrayList<String>();
		
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		
		// Iteration way 1
		System.out.println("Way 1");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// Iteration way 2
		System.out.println("Way 2");
		// Integer here is the type, value is the type in the numbers list
		// and so we print every value in the list
		for(Integer value : numbers) {
			System.out.println(value);
		}
		
		// Removing items (careful!)
		numbers.remove(0);
		
		// List interface...
		// so at new you say what kind of list it gonna be
		List<String> lastnames = new ArrayList<String>();
		
	}

}
