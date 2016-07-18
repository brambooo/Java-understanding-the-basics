package handlingexceptions.previewthrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// text.txt doesn't exists so we get an error, what we want here!
		File file = new File("text.txt");
		
		FileReader fr = new FileReader(file);
		
	}

}
