package tutorial6;

public class AnimalDemo {

	public static void main(String[] args) {

		Animal animal = new Animal("Homosapien");
		animal.displaySpecies();
		
		// If the Animal class were to be put in another package
		// it would show an access error as the default access specifier 
		// only has access to the package the default data member is defined in.
		
	}

}
