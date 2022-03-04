package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//Question 10 List Collections 

public class CollectionsListExample {
	public static void main(String args[]) {
		List<String> games = new ArrayList<String>();
		games.add("cricket");
		games.add("chess");
		games.add("football");
		games.add("baseball");
//		Question 11 Iterate and print list
		Iterator game = games.iterator();
		while (game.hasNext()) {
			System.out.println(game.next());
		}

		// Question 12 Sorting the list
		// The java.Collections.sort() method sorts the list elements by comparing the
		// ASCII values of the elements.
		System.out.println("Sorted List");
		Collections.sort(games);
		// Traversing list through the for-each loop
		for (String number : games)
			System.out.println(number);
		
//		Question 13 Using java stream to print list elements
		System.out.println("Using Stream to print elements");
		games.stream().forEach((element) -> System.out.println(element));

	}

}
