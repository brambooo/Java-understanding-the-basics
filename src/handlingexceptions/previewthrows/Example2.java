package handlingexceptions.previewthrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example2 {

	public static void main(String[] args) {
		
		// Now we can throw it away or catch it with a try catch block
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// PS. this message isn't detailed enough
			System.out.println("Could not open file");
		}
	}
	
	// openFile method that throws a exception is something is wrong
	public static void openFile() throws FileNotFoundException {
		File file = new File("text.txt");
		FileReader fr = new FileReader(file);
	}

}
