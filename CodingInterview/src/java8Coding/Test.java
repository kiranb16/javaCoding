package java8Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("ABC", 34, "MALE", "HR"));
		list.add(new Employee("CDE", 31, "FEMALE", "IT"));
		list.add(new Employee("POI", 39, "MALE", "HR"));
		list.add(new Employee("XVY", 30, "MALE", "IT"));
		// only department;
		list.stream().map(Employee::getDep).distinct().forEach(System.out::println);

		// department and employee

		Map<String, Long> result = list.stream()
				.collect(Collectors.groupingBy(Employee::getDep, Collectors.counting()));
		System.out.println(result);

		// average age of employee by gender;

		Map<String, Double> avgAge = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		
		System.out.println(avgAge);
	}
}
