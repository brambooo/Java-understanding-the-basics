class Frog {
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	W
	// Not that efficient
//	public String toString() {
//		return id + " " + name;
//	}
	
	// more efficient
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id: ").append(id).append(" name: ").append(name);
		return sb.toString();
	}
	
	
}
public class toString {
	public static void main(String[] args) {
		Frog frog1 = new Frog(1, "Bram");
		System.out.println( frog1.toString() );
		
		StringBuilder sb = new StringBuilder();
		sb.append(arg0)
	}
}
