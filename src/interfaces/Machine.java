package interfaces;

public class Machine implements Info, Repair {
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine started.");
	}
	
	/**
	 * showInfo will here be overriden from the Interface class
	 */
	@Override
	public void showInfo() {
		System.out.println("The id of the machine is: " + id);
	}
	
	@Override
	public void needRepair() {
		System.out.println("This machine need to be repaired!");
	}
	
	@Override
	public void repairDetails() {
		System.out.println("Special details of the repair are: ....");
	}
}
