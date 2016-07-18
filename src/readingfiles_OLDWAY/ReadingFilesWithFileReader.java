package readingfiles_OLDWAY;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFilesWithFileReader {

	public static void main(String[] args) {
		
		// Get file
		File file = new File("C:\\Users\\Bram\\Dropbox\\_JAVA\\Development\\JavaBasicsTutorial\\src\\readingfiles\\test.txt");
		
		// Read the file by putting the file into the fileReader
		// We need to use a try-catch-block because we need a catch-block to catch an error when file can't be found
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			
			// Now we like to buffer all lines into a BufferedReader (that reads all Strings)
			br = new BufferedReader(fr);
			String line;
			
			// Loop due all lines if line is not equal null
			while( (line = br.readLine()) != null ){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Unable to close file: " + file.toString());
		} catch(NullPointerException npe) {
			// File never be openened
		}
	}

}
