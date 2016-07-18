package readingfiles_NEWWAYJAVA7;

// This class auto close
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");

	}

}

public class Main {

	public static void main(String[] args) {
		// Java 7 way to try en catch
		try (Temp temp = new Temp()) {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
