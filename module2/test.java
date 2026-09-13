package module2;

class A1 {
	int i, j;
	void showij() {
		System.out.println("i&j in A1="+i+" "+j);
	}
}

class A2 extends A1 {
	int k;
	void showk() {
		System.out.println("i&j in A2,k="+i+" "+j+" "+k);
	}
}

class A3 extends A2 {
	void show() {
		System.out.println("i&j in A3,k="+i+" "+j+" "+k);
	}
}

public class test {
	public static void main(String args[]) {
	 	A3 ob=new A3();
		ob.i=1;
		ob.j=2;
		ob.k=3;
		ob.showij();
		ob.showk();
		ob.show();
	}
}