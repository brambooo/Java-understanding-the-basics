package collections.customobjectsinHashMap;



public class Movie {

	// Attributes
	private String title;
	private String genre;
	private int reviewScore;
	private String watchedDate;
	private String shortInformation;
	
	// Constructor
	public Movie(String title, String genre, int reviewScore, String watchedDate, String shortInformation) {
		this.title = title;
		this.genre = genre;
		this.reviewScore = reviewScore;
		this.watchedDate = watchedDate;
		this.shortInformation = shortInformation;
	}

	// Methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public String getWatchedDate() {
		return watchedDate;
	}

	public void setWatchedDate(String watchedDate) {
		this.watchedDate = watchedDate;
	}

	public String getShortInformation() {
		return shortInformation;
	}

	public void setShortInformation(String shortInformation) {
		this.shortInformation = shortInformation;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Titel: " + getTitle() );
		sb.append("\nGenre: " + getGenre() );
		sb.append("\nBeoordeling: " + getReviewScore() + " sterren");
		sb.append("\nBekeken: " + getWatchedDate() );
		sb.append("\nInformatie: " + getShortInformation() );
		
		return sb.toString();
	}
}