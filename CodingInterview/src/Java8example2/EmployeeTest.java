package Java8example2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	double salary;
	String city;

	public Employee(int id, String name, double salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ",city=" + city + "]";
	}

}

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(111, "AA", 50000, "pune"));
		list.add(new Employee(222, "BB", 30000, "pune"));
		list.add(new Employee(444, "CC", 40000, "mumbai"));
		list.add(new Employee(333, "DD", 70000, "mumbai"));

		Optional<Double> salary = list.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(2)
				.findFirst();
		System.out.println(salary);
		
		//grouped by city

		Map<String, List<Employee>> grouped = list.stream().collect(Collectors.groupingBy(Employee::getCity));
		for (Map.Entry<String, List<Employee>> m : grouped.entrySet()) {
			System.out.println(m);
		}
	}
}
