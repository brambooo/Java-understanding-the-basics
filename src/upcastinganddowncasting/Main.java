package upcastinganddowncasting;

class Machine {
	
	public void start() {
		System.out.println("Start machine!");
	}
	
}

//subclass
class Telephone extends Machine {
	
	@Override
	public void start() {
		System.out.println("Start telephone!");
	}
	
	public void sendMessage() {
		System.out.println("Phone message sent!");
	}
}

public class Main {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Telephone telephone1 = new Telephone();
		
		machine1.start();
		telephone1.start();
		
		// Upcasting
		System.out.println("Upcasting:");
		Machine machine2 = telephone1;
		// Here it runs the object of telephone1 which is a Telephone object, so it says Start telephone
		machine2.start();
		// Error: machine2.sendMessage();	// because the variabele type is a Machine not a Telephone
		

//		// Downcasting
		// This works because the object type from telephone2 is a Telephone
		Machine telephone2 = new Telephone();
		Telephone telephone3 = (Telephone) telephone2;
		System.out.println("Downcasting");
		telephone3.sendMessage();
		
		// Doesn't work --- runetime error.
		// This doesn't work because machine3 = a Machine and can only be a Machine
		// so we can't downcast machine3 into telephone4
		Machine machine3 = new Machine();
		Telephone telephone4 = (Telephone) machine3;
		// error: telephone4.start();
		
//		Machine telephone5 = new Telephone();
//		telephone5.start();
//		telephone5.sendMessage();

	}

}
