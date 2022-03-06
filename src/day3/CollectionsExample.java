package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set; 

public class CollectionsExample {
	public static void main(String args[]) {
		Employee e1 = new Employee(1, "Anil");
		Employee e2 = new Employee(2, "Rakesh");
		Employee e3 = new Employee(3, "Siva");
		Employee e4 = new Employee(4, "Jeevan");
		Employee e5 = new Employee(5, "Amul");
		Employee e6 = new Employee(6, "Rajesh");
		Employee e7 = new Employee(7, "Ram");

// 		Collections List
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
//		Iterating List
		System.out.println("Iterating List :");
		for (Employee e : employees) {
			System.out.println(e.eId + " " + e.eNameString);
		}
		// BeforeDrag Sorting
		System.out.println("Before Sorting ");
		for (Employee emp : employees)
			System.out.println(emp.eId + " " + emp.eNameString);

		System.out.println("After Sorting ");
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee a, Employee b) {

				return b.eId - a.eId;
			}
		});

		System.out.println("Iterating Employes using stream");

		employees.stream().forEach((a) -> System.out.println("Name : " + a.eId + ", ID : " + a.eNameString));

// 		Set List
		Set<Employee> setEmployees = new HashSet<Employee>();
		setEmployees.add(e4);
		setEmployees.add(e5);

//		Iterating Set
		System.out.println("Iterating set :");
		for (Employee e : employees) {
			System.out.println(e.eId + " " + e.eNameString);
		}
//		Collections Map
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1001, e6);
		map.put(1002, e7);
		System.out.println("Iterating Map :");
		for (Map.Entry<Integer, Employee> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue().eNameString);
		}

	}
}
