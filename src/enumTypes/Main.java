package enumTypes;

public class Main {
	public static void main(String[] args) {
		AnimalAdvanced animal = AnimalAdvanced.SNAKE;
		
	switch(animal) {
	case CAT:
		System.out.println("Cat");
		break;
	case DOG:
		System.out.println("Dog");
		break;
	case SNAKE:
		System.out.println("Snake");
		break;
	}
	
	
	System.out.println(AnimalAdvanced.DOG.getName());
	System.out.println(AnimalAdvanced.SNAKE.toString());
	
	System.out.println("Get enum type a a String: " + AnimalAdvanced.DOG.name());
	
	// This is also possible
	AnimalAdvanced animal2 = AnimalAdvanced.valueOf("DOG");
	System.out.println(animal2);
	}

}
