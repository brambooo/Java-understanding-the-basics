package handlingexceptions.runtime;

public class Main {

	public static void main(String[] args) {
		// RuntimeException
//		String[] texts = {"Bram", "Koen", "Michel", "Jeroen"};
//		System.out.println(texts[4]);
		
		// RunTimeException 2
		// ArithmeticException can't divide by zero
		int number = 5;
		int value = number/0;
		System.out.println(value);
	}

}
