package anonymousclasses;


interface Plant {
	public void grow();
}

public class ExampleTwo {

	public static void main(String[] args) {
		
		// Anonymous subclass with the interface in it
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Plant is growing");
			}
		};
		plant1.grow();
	}

}
