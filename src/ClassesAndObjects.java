
// private subclass
class Person {
	// Attributes
	private String name;
	private String email;
	private int age;
	private String phoneNumber;
	
	// Constructor
	public Person(String name, int age, String email, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	// Methods
	public void personSpeaks() {
		System.out.println("My name is " + name);
		System.out.println("and my age is " + age + ".");
	}
	
	public void getGrade(int grade) {
		if(grade <= 5) {
			System.out.println("You don't passed your exam...");
		} else {
			System.out.println("You passed your exam! Congratulations!!!");
		}
	}
}

public class ClassesAndObjects {
	public static void main(String[] args) {
		Person bram = new Person("Bram", 22, "bram_reinold@hotmail.com", "0618692451");
		
		bram.personSpeaks();
		bram.getGrade(5);
	}
}
