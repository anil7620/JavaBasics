package unwanted;

//Question 1 Add an interface
interface MyInterface {

	public void method1();

	public void method2();
}

class InterfaceExample implements MyInterface {
//Question2 Declare 2 methods in interface
	public void method1() {
		System.out.println("implementation of method1");
	}

	public void method2() {
		System.out.println("implementation of method2");
	}

	public static void main(String arg[]) {
		MyInterface obj = new InterfaceExample();
		obj.method1();
		obj.method2();
	}
}
