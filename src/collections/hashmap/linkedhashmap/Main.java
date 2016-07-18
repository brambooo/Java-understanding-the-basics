package collections.hashmap.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		// test the Maps with our created method below
		System.out.println("LinkedHashMap:");
		testMap(linkedHashMap);
		System.out.println("\nTreeMap");
		testMap(treeMap);
	}
	
	
	public static void testMap( Map<Integer, String> map ) {
		map.put(5, "Bram");
		map.put(12, "Koen");
		map.put(15, "Willem");
		map.put(2, "Peter");
		map.put(8, "Michel");
		map.put(7, "Jeroen");
		map.put(24, "Lars");
		
		// keySet = set of keys of the map
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}

}
