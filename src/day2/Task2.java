package day2;

public class Task2 {
//	Question 9 - Create a class with two functions one recursive and one non recursive. 
//				 Either of these function should be capable of calculating the factorial of a number.

	static int factWithRecursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factWithRecursion(n - 1));
		}

	}

	static int addWithoutRecursion(int n) {
		return n + n;
	}

	public static void main(String[] args) {
		System.out.println("Factorial With Recursion: " + factWithRecursion(3));
		System.out.println("Addition Without Recursion: " + addWithoutRecursion(5));
	}

}
