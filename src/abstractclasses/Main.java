package abstractclasses;

public class Main {

	public static void main(String[] args) {
		Camera camera1 = new Camera(1, "Canon", 15);
		System.out.println(camera1.getPixels());
		camera1.startMachine();

	}

}
