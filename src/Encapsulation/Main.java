package Encapsulation;

public class Main {
	
	public static void main(String[] args) {
		
		// new plant object
		Plant plant1 = new Plant();
		//plant1.growPlant();
		
		Machine machine1 = new Machine("Super Brambo", 2);
		System.out.println(machine1.getMachineInfo());
	}
}
