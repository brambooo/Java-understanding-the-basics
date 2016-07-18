package accessmodifiers;

public class Plant {
	public String name;
	public final static int ID = 8;
	
	private String type;
	
	public Plant(String name, String type) {
		this.name = name;
		this.type = type;
	}
}
