package Java8Example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Employee2Test {
	public static void main(String[] args) {
		List<Employee2> list = new ArrayList<>();
		list.add(new Employee2("a", 21, "male", "mech", 2015, 123456.90));
		list.add(new Employee2("batwal", 23, "male", "it", 2016, 223456.90));
		list.add(new Employee2("c", 24, "female", "mech", 2012, 323456.90));
		list.add(new Employee2("d", 25, "female", "it", 2013, 234565.90));
		list.add(new Employee2("e", 26, "male", "mech", 2011, 234536.90));
		list.add(new Employee2("f", 27, "female", "it", 2015, 9234576.90));
		// whole Employee Gives
		Optional<Employee2> re = list.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed()).skip(2)
				.findFirst();
		System.out.println(re);

		Optional<Double> salary = list.stream().map(Employee2::getSalary).sorted(Comparator.reverseOrder()).skip(2)
				.findFirst();
		System.out.println("only salary "+salary);

	}
}
