package rfilewriter_java7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// get file
		File file = new File("test.txt");
		// We only need to change the BufferedReader into Writer and same for fileReader into fileWriter
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("This is line one");
			br.write("This is line two");
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
	}

}
