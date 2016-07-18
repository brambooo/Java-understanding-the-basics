package inheritence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mach1 = new Machine();
		mach1.stop();
		
		Car car1 = new Car();
		car1.startHorn();
		car1.stop();
		
		// Here we show the overriden method in Car
		// It should say now 'Car started' except of 'Machine started'.
		car1.start();
	}

}
