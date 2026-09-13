package tutorial6;

class Animal {
	String species; // default access
	
	Animal (String species) {
		this.species = species;
	}
	
	void displaySpecies() {
		System.out.println("Species: " + species);
	}
}