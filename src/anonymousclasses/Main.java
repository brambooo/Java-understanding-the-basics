package anonymousclasses;

class Machine {
	public void start() {
		System.out.println("Starting machine...");
	}
}

interface Costs {
	public void costs();
}

public class Main {

	public static void main(String[] args) {
		
		//////////// Exampe 1 ////////////
		Machine phone = new Machine() {
			// Here we can override methods
			@Override
			public void start() {
				System.out.println("Starting phone!");
			}
		};
		phone.start();
		
		////////////Exampe 2 ////////////

		
		Costs phoneCosts = new Costs() {
			@Override
			public void costs() {
				System.out.println("The costs are 5 dollar");
			}
		};
		phoneCosts.costs();
		
	}
}
