package abstractclasses;

public abstract class BasicMachine {
	// Attributes
	private int id;
	private String name;
	
	public BasicMachine(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Abstract method
	public abstract void startMachine();
}
