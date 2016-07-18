package equalsmethod;

class Person {
	// Attributes
	private int id;
	private String name;
	
	// Constructor
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "Person id: " + id + " and name: " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
public class Main {

	public static void main(String[] args) {
		Person person1 = new Person(5, "Bram");
		Person person2 = new Person(5, "Bram");
		
		Person person3 = new Person(3, "Koen");
		Person person4 = new Person(4, "Koen");
		
		// Primitive types
		int value1 = 5;
		int value2 = 5;
		
		Integer value3 = 5;
		Integer value4 = 5;
		
		System.out.println("Person 1 is equals Person2: " + person1.equals(person2));
		System.out.println("Person 1 is equals Person3: " + person3.equals(person4));
		
		System.out.println("int Value 1 is equals int value 2: " + ( value1 == value2) );
		System.out.println("Integer value3 is equals Integer value4: " + (value3 == value4));
		System.out.println("Integer value3 is equals Integer value4: " + value3.equals(value4));
		
		
		// String equals
		System.out.println("\n\n Now we gonna try out Strings");
		
		String text1 = "Bram";
		String text2 = "Bram";
		
		System.out.println("Compare with == " +  (text1 == text2) );
		System.out.println("Compare with equals " + text1.equals(text2));

	}

}
