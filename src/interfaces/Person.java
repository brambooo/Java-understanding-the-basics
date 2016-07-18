package interfaces;

public class Person implements Info{
	
	// Attributes
	private String name;
	
	// Constructor
	public Person(String name) {
		this.name = name;
	}
	
	// Methods
	public void great() {
		System.out.println("Hello there.");
	}
	
	public void showInfo() {
		System.out.println("My name is: " + name);
	}
	
}
