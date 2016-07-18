package ReadingFilesUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:\\Users\\Bram\\Dropbox\\_JAVA\\Development\\JavaBasicsTutorial\\saved\\savedData.txt";
		
		// Create a new textfile and put the location into it
		File textFile = new File(fileName);
		
		// Create a new Scanner to show the output
		Scanner in = new Scanner(textFile);
		
		// Loop due the savedDate in file
		while(in.hasNextLine()) {
			StringBuilder sb = new StringBuilder();
			sb.append( in.nextLine() );
			// print in console
			System.out.println(sb);
		}
		in.close();
	}

}
