package coreJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Employee> empliList = new ArrayList<>();
		empliList.add(new Employee(111, "kiran", 102, "active", 120000));
		empliList.add(new Employee(222, "ratan", 102, "active", 20000));
		empliList.add(new Employee(233, "jagan", 1033, "inactive", 13200));
		empliList.add(new Employee(333, "santosh", 1025, "active", 13000));
		empliList.add(new Employee(1145, "nivrutti", 1033, "inactive", 20000));
		// employee details on based department
		Map<Integer, List<Employee>> emplistBasedOnDepid = empliList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptid, Collectors.toList()));
		emplistBasedOnDepid.entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + "-----" + entry.getValue()));

		// employee counter based on
		Map<Integer, Long> empbasedDep = empliList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptid, Collectors.counting()));

		empbasedDep.entrySet().forEach(entry -> {
			System.out.println("dept" + entry.getKey() + "----" + entry.getValue());
		});

		Long activeEmpStatus = empliList.stream().filter(e -> "active".equals(e.getStatus())).count();
		Long inActiveEmpStatus = empliList.stream().filter(e -> "inactive".equals(e.getStatus())).count();
		System.out.println("active employee" + activeEmpStatus);
		System.out.println("inactive employee" + inActiveEmpStatus);

		Optional<Employee> empmax = empliList.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee> empmin=empliList.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println(empmax);
		System.out.println(empmin);
	}
}




















