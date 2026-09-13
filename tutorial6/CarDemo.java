package tutorial6;

class Car {
	private String model;
	
	public Car(String model) {
		this.model = model;
	}
	
	public void showModel() {
		System.out.println("Model: " + model);
	}
}

public class CarDemo {

	public static void main(String[] args) {
		
		Car ob = new Car("Ferrari SF90");
		// System.out.println("Model: " + ob.model);
		ob.showModel();
		
	}

}
