package innerclasses;

import innerclasses.Robot.Brain;

public class Main {

	public static void main(String[] args) {
		Robot robot1 = new Robot(1);
		robot1.startRobot();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}
