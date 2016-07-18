import java.util.Scanner;

public class DoWhileLoops {
	public static void main(String[] args) {
		
//		// Create first a new scanner object
//		Scanner input = new Scanner(System.in);
//		
//		// Output the prompt
//		System.out.println("Enter a number between 0 and 10");
//			
//		// wait for the user input
//		int value = input.nextInt();
//		
//		while(value != 5) {
//			System.out.println("Enter a number between 0 and 10");
//			value =  input.nextInt();
//		}
//		
//		if(value == 5) {
//			System.out.println("You guessed the right number " + value + "!");
//		}
	
		
		// Create first a new scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare the variable value
		int value = 0;
		
		do {			
			System.out.println("Enter a number between 0 and 10");
			value =  input.nextInt();
		} 
		while(value != 5);
		System.out.println("You guessed the right number 5!");
	}

}
