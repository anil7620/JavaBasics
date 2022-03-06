package day2;
//Question 11 - Write a Generic class in java.

public class GenericExample<A> {
	A element;

	public A getElement() {
		return element;
	}

	public void setElement(A element) {
		this.element = element;
	}

	public static void main(String[] args) {
//		Question 12 - initialize generic class created in step 12 with different data type 
		GenericExample<String> name = new GenericExample<String>();
		GenericExample<Integer> id = new GenericExample<Integer>();

//		Add a method to the class that returns and print the data when called using generic class object.
		name.setElement("Anil");
		id.setElement(1);

		System.out.println("Printing String using Generic Class: " + name.getElement());
		System.out.println("Printing Integer using Generic Class: " + id.getElement());

	}
}
