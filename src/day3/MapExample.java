package day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("Phone Records Using Map");
		map.put("Name1", 8974564);
		map.put("Name2", 5646895);
		map.put("Name3", 5564879);
		map.put("Name4", 4568972);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}

}
