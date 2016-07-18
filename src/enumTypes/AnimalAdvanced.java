package enumTypes;

public enum AnimalAdvanced {
	// Remember those types CAT,DOG,SNAKE are NOT Strings
	// They are OBJECTS!!!
	CAT("Frits", 5), DOG("Luuk", 12), SNAKE("Snakie", 5);
	
	private String name;
	private int age;

	AnimalAdvanced(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "This animal is called: " + name + " and his age is: "+ age;
	}
}

