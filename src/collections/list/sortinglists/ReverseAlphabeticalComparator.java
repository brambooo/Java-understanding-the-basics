//package collections.list.sortinglists;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Person {
//	private int id;
//	private String name;
//	
//	public Person(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//}
//public class ReverseAlphabeticalComparator implements Comparator<Person> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		return -s1.compareTo(s2);
//	}
//}
//
//
//class runApp {
//	public static void main(String[] args) {
//		List<Person> persons = new ArrayList<Person>();
//		
//		persons.add( new Person(9, "Bram") );
//		persons.add( new Person(5, "Koen") );
//		persons.add( new Person(1, "Michel") );
//		persons.add( new Person(4, "Jeroen") );
//		
//		
//		Collections.sort(persons, new ReverseAlphabeticalComparator() );
//		
//		for(Person person : persons) {
//			System.out.println(person);
//		}
//	}
//}
