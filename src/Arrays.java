
public class Arrays {
	
	public static void main(String[] args) {
		int[] values;
		
		values = new int[5];
		
		// So now we have a array with 5 items
		// we assign some values to it now
		values[0] = 10;
		values[1] = 11;
		values[2] = 12;
		values[3] = 13;
		values[4] = 14;
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		// Stel we maken nu meer values items dan bovenin is aangegeven in de int[] waarde
		//Dan krijgen we een ArrayIndexOutOfBoundsException
		
		
		// Now we initialize an Array at once
		int[] numbers = {2,4,6,8,10}; 
		for(int b = 0; b < numbers.length; b++) {
			System.out.println(numbers[b]);
		}
		
		
		// String array
		String[] words = new String[3];
		words[0] = "Bram";
		words[1] = "Koen";
		words[2] = "Michel";
		
		for(int s = 0; s < words.length; s++) {
			System.out.println(words[s]);
		}
		
		// String array initialize at once
		String[] fruits = {"banana", "apple", "kiwi"};
		
		// Other common used loop that can be used with objects or Strings like this:
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		// Multi-dimensional Arrays
		int[][] grid = {
				{1,5,2},	// row 0	
				{2,4,5},	// row 1	
				{5,4,3},	// row 2
				{5,1,2}		// row 3
		};
		
		// so now we want the second item in row 1
		System.out.println(grid[1][1]);
		
		// now we want the first item in the last row (row 3)
		System.out.println(grid[3][0]);
		
		
	}
}
