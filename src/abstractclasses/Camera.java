package abstractclasses;

public class Camera extends BasicMachine {
	// Attributes
	private int pixels;

	public Camera(int id, String name, int pixels) {
		super(id, name);
		this.pixels = pixels;
	}

	// Methods
	public int getPixels() {
		return pixels;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}

	// Method from parent Machine class that need to be override
	@Override
	public void startMachine() {
		System.out.println("Camera started!");

	}

}
