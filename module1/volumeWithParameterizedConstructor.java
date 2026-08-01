package module1;

class Box1 {
	double height, width, depth;
	Box1(double h, double w, double d) { // parameterized constructor;
		height = h;
		width = w;
		depth = d;
	}
	double calculateVolume() {
		return (height*width*depth);
	}
}

public class volumeWithParameterizedConstructor {

	public static void main(String[] args) {
		// Volume of a box with default constructor
		Box1 myBox1 = new Box1(2, 6, 10);
		Box1 myBox2 = new Box1(5, 10, 15);
		double volume1 = myBox1.calculateVolume();
		double volume2 = myBox2.calculateVolume();
		System.out.println("Volume1: " + volume1);
		System.out.println("Volume2: " + volume2);
	}

}
