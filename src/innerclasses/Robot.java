package innerclasses;

public class Robot {

	// Attributes
	private int id;
	
	// Constructor
	public Robot(int id) {
		this.id = id;
	}
	
	// Methods
	public void startRobot() {
		System.out.println("Starting robot " + id);
		Brain brain = new Brain();
		brain.think();
	}
	
	// Inner class
	 public class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	 
	 // Static Inner class
	 static class Battery {
		 public void charge() {
			 System.out.println("Battery charging...");
		 }
	 }
}
