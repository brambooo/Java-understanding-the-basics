package JodaTime.LocalDateDutch;


import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

class Main {
    public static void main(String[] args) {
	
    	LocalDate date = LocalDate.parse("31-05-1993", DateTimeFormat.forPattern("dd-MM-yyyy"));
    	System.out.println( date.toString("dd-MM-yyyy") );
    
    }
}