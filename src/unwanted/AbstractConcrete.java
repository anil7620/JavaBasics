package unwanted;

//Question 6 Override the methods of Abstract class in concrete class

abstract class Algebra {

	public void product(int a, int b) {
		System.out.println("Parent Class returns: " + a * b);

	}

	public void sum(int a, int b) {
		System.out.println("Parent Class returns: " + a + b);
	}
}

class AbstractConcrete extends Algebra {

	public void product(int a, int b) {
		System.out.println("AbstractConcrete Class returns: " + a * b);

	}

	public void sum(int a, int b) {
		System.out.println("AbstractConcrete Class returns: " + a + b);
	}

	public static void main(String args[]) {
//		Question7 Create Object for concrete class
		AbstractConcrete ob = new AbstractConcrete();
//		Question9 Access the Concrete class methods
		ob.product(6, 10);
		ob.sum(6, 10);

		Algebra algebra = new AbstractConcrete();
//		Question8 Access the Abstract class methods

		algebra.product(2, 3);
		algebra.sum(4, 5);

	}
}
