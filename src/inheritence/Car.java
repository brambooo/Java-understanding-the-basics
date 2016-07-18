package inheritence;

/**
 * Car is a child class of Machine
 * @author Bram
 *
 */
public class Car extends Machine {

	public void startHorn() {
		System.out.println("Toet!");
	}
	
	// Now we gonna show how to override a method from the superclass
	@Override
	public void start() {
		System.out.println("Car started!");
	}
}
