package collections.customobjectsinHashSet;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Movie movie1 = new Movie("Peter Pan", "Avontuur", 5, "31-05-1993", "Kinderfilm dfghdfhdfhdhdfhfgh");
		Movie movie2 = new Movie("James Bond", "Actie", 2, "04-02-2004", "James Bond Casino Royale");
		Movie movie3 = new Movie("Notebook", "Romantiek", 3, "31-05-2015", "Een en al liefde");
		Movie movie4 = new Movie("The Beach", "Avontuur", 6, "23-07-2014", "Mooi strand, mysterie leuke mensen");
		Movie movie5 = new Movie("The Suit", "Thriller", 5, "06-04-2013", "Veel actie en eng");
		
		// I like to have a sorted list alfabetic ordered
		Set<Movie> movies = new LinkedHashSet<Movie>();
		
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);
		
		for(Movie mov : movies) {
			System.out.println(mov);
			System.out.println("");
		}
//		
//		Iterator<Movie> itr =  movies.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
