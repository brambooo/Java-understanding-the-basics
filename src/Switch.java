import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		// Switch statement with String check
		// First we declare a new Scanner and initialize it, so we can get user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Command center: ...");
		String text = input.nextLine();
		
		switch(text) {
			case "start":
				System.out.println("Vietcong started!");
				break;
			case "exit":
				System.out.println("Vietcong closed!");
				break;
				
			default:
				System.out.println("Command not found!");
		}
		
		
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter a grade: ...");
		int value = input2.nextInt();
		
		switch(value) {
			case 4:
				System.out.println("Exam not passed!");
				break;
			case 5:
				System.out.println("Exam not passed!");
				break;
			case 6:
				System.out.println("Exam passed, congratulations!");
			default:
				System.out.println("Grade not found, try again!");
		}
	}
}
