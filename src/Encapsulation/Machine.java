package Encapsulation;

public class Machine {
	
	// Attributes
	private String name;
	private int age;
	
	// Constructor
	public Machine(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Methods
	// public method - so accessible from other classes also
	public String getMachineInfo() {
		String data = "Data is: " + getName() + " " + calculateMachineAge(); 
		return data;
	}
	
	// Private method - only accessible from this class
	private String getName() {
		return name;
	}
	
	// Private method - only accessible from this class	
	private int calculateMachineAge() {
		return age;
	}
}
