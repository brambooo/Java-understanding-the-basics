import javax.swing.plaf.synth.SynthSpinnerUI;

import org.omg.Messaging.SyncScopeHelper;

//
//class Thing {
//	// Attributes
//	public final static int LUCKY_NUMBER = 7;
//	public String name;
//	public static String description;
//	
//	public Thing() {
//		
//	}
//	
//	public static void getInfo() {
//		System.out.println(Thing.description);
//	}
//	
//	public void getAllInfo() {
//		System.out.println("My name is: " + name);
//		System.out.println("special information: " + description);
//	}
//	
//	// Deze methode werkt dus niet, want hierbij halen we de instant variabelen name op in een static methoden
//	public static void getName() {
//		System.out.println(Thing.name);
//	}
//}
//
//public class StaticAndFinal {
//	
//	public static void main(String[] args) {
//		Thing t1 = new Thing();
//		Thing t2 = new Thing();
//		
//		t1.name = "Bram";
//		t2.name = "Michel";
//		
//		Thing.description = "Hallo";
//		
//		Thing.getInfo();
//	}

class Customer {
	// Attributes
	public static int CUSTOMER_NUMBERS = 0;
	public String name;
	
	public Customer(String name) {
		this.name = name;
		CUSTOMER_NUMBERS++;
	}
}

	public class StaticAndFinal {
		public static void main(String[] args) {
			Customer c1 = new Customer("Bram");
			Customer c2 = new Customer("Henk");
			System.out.println( Customer.CUSTOMER_NUMBERS );
		}	
	}
		
