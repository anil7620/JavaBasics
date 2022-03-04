package day3;

import java.util.HashSet;
import java.util.Iterator;

//Question 10 Set Collections  
public class SetExample {
	public static void main(String args[]) {
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Watermelon");
		fruits.add("Banana");
//		Question 11 Iterate and print Set

		Iterator<String> fruit = fruits.iterator();
		while (fruit.hasNext()) {
			System.out.println(fruit.next());
		}
	}

}