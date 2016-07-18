package enumTypes;

public class Animal {
	private String name;
	private int age;
	private AnimalTypes TYPE;
	
	public Animal(String name, int age, AnimalTypes TYPE) {
		this.name = name;
		this.age = age;
		this.TYPE = TYPE;
	}
	
	// Like this way you can set a specific Enum type to a object!
	Animal animal1 = new Animal("Brambo", 5, AnimalTypes.CAT);
}
