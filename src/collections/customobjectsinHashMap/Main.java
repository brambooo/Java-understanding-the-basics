package collections.customobjectsinHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		// Movie objects with a specific ID
		Movie movie1 = new Movie("Peter Pan", "Avontuur", 5, "31-05-1993", "Kinderfilm dfghdfhdfhdhdfhfgh");
		Movie movie2 = new Movie("James Bond", "Actie", 2, "04-02-2004", "James Bond Casino Royale");
		Movie movie3 = new Movie("Notebook", "Romantiek", 3, "31-05-2015", "Een en al liefde");
		Movie movie4 = new Movie("The Beach", "Avontuur", 6, "23-07-2014", "Mooi strand, mysterie leuke mensen");
		Movie movie5 = new Movie("The Suit", "Thriller", 5, "06-04-2013", "Veel actie en eng");
		
		// I like to have a sorted list alfabetic ordered
		Map<String, Movie> movies = new HashMap<String ,Movie>();
		
		movies.put("Peter Pan", movie1);
		movies.put("James Bond", movie2);
		movies.put("Notebook", movie3);
		movies.put("The Beach", movie4);
		movies.put("The Suit", movie5);
		
		// Loop due all movie objects and print them!
		for( Map.Entry<String, Movie> entry : movies.entrySet() ) {
			System.out.println( entry.getValue() );
			System.out.println("");
		}
		
	}

}
