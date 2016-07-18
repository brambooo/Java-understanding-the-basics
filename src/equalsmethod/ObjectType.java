package equalsmethod;

class Person2 {
	// Attributes
	private int id;
	private String name;

	// Constructor
	public Person2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Person id: " + id + " and name: " + name;
	}
}

public class ObjectType {
	public static void main(String[] args) {
		Person2 person1 = new Person2(1, "Bram");
		Person2 person2 = new Person2(2, "Bram");
	
	}
}
