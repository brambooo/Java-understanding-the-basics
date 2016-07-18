package gettinguserinput;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// This allows text and also numbers
		// Create scanner object
//		Scanner input = new Scanner(System.in);
//		
//		// Output the prompt
//		System.out.println("Enter a line of text: ");
//			
//		// wait for the user input
//		String line = input.nextLine();
//		
//		// Tell what they entered
//		System.out.println("You entered: " +  line);
//		
//		
//		
		
		// This only allows numbers
		// Create scanner object
//		Scanner input2 = new Scanner(System.in);
//		
//		// Output the prompt
//		System.out.println("Enter a line of numbers: ");
//			
//		// wait for the user input
//		int line2 = input2.nextInt();
//		
//		// Tell what they entered
//		System.out.println("You entered: " +  line2);
		
		
		
		// With a double
		
		// First we need to create a new Locale 
		Locale locale = new Locale("nl", "NL");
		
		// Now we set the specific locale to Dutch
		NumberFormat format = NumberFormat.getInstance(locale);
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter a double value: ");
		
//		double line3 = input3.nextDouble();
//		String number = format.format(line3);
		
		// shortcode
		String number = format.format( input3.nextDouble() );
						
		System.out.println("You entered: " + number + " euro.");
	}
	
	

}
