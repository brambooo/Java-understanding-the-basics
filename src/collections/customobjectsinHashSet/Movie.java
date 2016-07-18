package collections.customobjectsinHashSet;

import java.util.Date;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + reviewScore;
		result = prime * result + ((shortInformation == null) ? 0 : shortInformation.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((watchedDate == null) ? 0 : watchedDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (reviewScore != other.reviewScore)
			return false;
		if (shortInformation == null) {
			if (other.shortInformation != null)
				return false;
		} else if (!shortInformation.equals(other.shortInformation))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (watchedDate == null) {
			if (other.watchedDate != null)
				return false;
		} else if (!watchedDate.equals(other.watchedDate))
			return false;
		return true;
	}
	
	
	
}