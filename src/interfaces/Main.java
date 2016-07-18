package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mach1 = new Machine();
		Person person1 = new Person("Bram");
		person1.great();
		person1.showInfo();
		
		mach1.showInfo();
		mach1.needRepair();
		mach1.repairDetails();
		
		// It is not possible to create a object straight of a Interface class
		// So we need to implement the interface in a normal class like 'Machine'
		// this object can now use the methods from the interface class.
		Info info1 = new Machine();
		info1.showInfo();
	
		
	}

	public static void getRepair(Repair repair) {
		repair.needRepair();
	}
	
}
