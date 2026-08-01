package module1;

class Box {
	double height, width, depth;
	Box() { // no argument constructor;
		height = 2;
		width = 5;
		depth = 10;
	}
	double calculateVolume() {
		return (height*width*depth);
	}
}

public class volumeWithNoArgConstructor {

	public static void main(String[] args) {
		// Volume of a box with default constructor
		Box myBox = new Box();
		double volume = myBox.calculateVolume();
		System.out.println("Volume: " + volume);
	}

}
