package module2;

class A {
	int i, j;
	void showij() {
		System.out.println("i & j: " + i + " " + j);
	}
}

class B extends A {
	int k;
	void showk() {
		System.out.println("i: " + i + " j: " + j + " k: " + k);
	}
}
public class Inher {

	public static void main(String[] args) {
		B ob = new B();
		ob.i = 1;
		ob.j = 2;
		ob.k = 3;
		ob.showij();
		ob.showk();

	}

}
