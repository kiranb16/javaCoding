import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee1Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Kiran", 32000, "mechanical"));
		list.add(new Employee("Sultan", 23087, "CIVIL"));
		list.add(new Employee("Rajveer", 39085, "ENTC"));
		list.add(new Employee("Atharva", 38593, "CIVIL"));

		// 3rd salary
		Optional<Double> salary = list.stream().map(e -> e.getsalary()).sorted(Comparator.reverseOrder()).skip(2)
				.findFirst();
		System.out.println(salary);

		// grouping by department

		Map<String, List<Employee>> lee = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(lee);

		System.out.println("---------------------------------------------------------------------------");
		Employee re = list.stream().filter(e -> e.getDepartment().equals("CIVIL"))
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getsalary))).get();
		System.out.println(re.getName());
		
		

		
	}
}
