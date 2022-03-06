package unwanted;

//Question 5 Implements methods of interface class in concrete class

interface X {
	int product(int a, int b);

	int sum(int a, int b);
}


class ConcreteExample implements  X{

	public int sum(int a, int b) {
		return a + b;
	}
	@Override
	public int product(int a, int b) {
		 
		return a*b;
	}

	public static void main(String args[]) {
		ConcreteExample ob = new ConcreteExample();
		int p = ob.product(5, 10);
		int s = ob.sum(5, 10);

		System.out.println("Product: " + p);

		System.out.println("Sum: " + s);
	}
}



//abstract class Product implements X {
//
//	public int product(int a, int b) {
//		return a * b;
//	}
//}

//class ConcreteExample extends Product {