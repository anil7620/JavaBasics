package day3;

//Question3 Add an Abstract class
abstract class Animal {
	abstract void makeSound();

	public void eat() {
		System.out.println("I can eat.");
	}
}
//Question4 Add methods with definition in abstract class
class Dog extends Animal {
	 
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

class AbstractExample {
	public static void main(String[] args) {

		 
		Dog d1 = new Dog();

		d1.makeSound();
		d1.eat();
	}
}