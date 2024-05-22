package java8Coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee2Test {
	public static void main(String[] args) {
		List<Employee2> list = new ArrayList<>();
		list.add(new Employee2("ABC", 30, "MALE", "HR", 2012, 23000));
		list.add(new Employee2("CDE", 34, "FEMALE", "IT", 2010, 25000));
		list.add(new Employee2("MNO", 39, "MALE", "HR", 2016, 20000));
		list.add(new Employee2("PQR", 37, "MALE", "IT", 2014, 13000));
		list.add(new Employee2("ABC", 35, "FEMALE", "HR", 2013, 3000));

		// male and female
		Map<String, Long> count = list.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.counting()));
		System.out.println(count);
		
		System.out.println("department");
		
		
		// all department
		list.stream().map(Employee2:: getDep).distinct().forEach(System.out::println);

		// average age of male and female;

		Map<String, Double> res = list.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.averagingDouble(Employee2::getAge)));
		System.out.println("average age" + res);

		// highest paid Employee;

		Optional<Employee2> highestPaid = list.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee2::getSalary)));
		String name = highestPaid.get().getName();
		System.out.println(" highest paid employee : " + name);

		// average salary female;
		double salary = list.stream().filter(e -> e.getGender().equals("FEMALE"))
				.collect(Collectors.averagingDouble(Employee2::getSalary));
		System.out.println(" female salary "+salary );

		
	}
}
