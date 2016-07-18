package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		// plant object
		Plant plant1 = new Plant();
		plant1.grow();
		
		// Plant object as super and as child a tree
		Plant tree1 = new Tree();
		tree1.grow();
		
		// This also works for both classes
		growPlant(plant1);
		growPlant(tree1);
	}
	
	// Static method
	public static void growPlant(Plant plant) {
		plant.grow();
	}

}
