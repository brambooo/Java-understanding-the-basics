package readingfiles_NEWWAYJAVA7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPreview {
	public static void main(String[] args) {
		// get file
		File file = new File("test.txt");
		// Read file en pass it into BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Can't find file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
	}

}
