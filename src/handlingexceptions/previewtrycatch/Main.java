package handlingexceptions.previewtrycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// text.txt doesn't exists so we get an error, what we want here!
		File file = new File("text.txt");
		
		try {
			// Try to do this code
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// When there is a exception de catch will be activated
			//e.printStackTrace(); // is the normal error
			
			// self defined error
			System.out.println("File not found: " + file.toString());
		}
		
	}
}
