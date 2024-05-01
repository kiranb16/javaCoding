import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	private String name;
	private double salary;
	private String department;

	public Employee(String name, int age, String department) {
		super();
		this.name = name;
		this.salary = age;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getsalary() {
		return salary;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + salary + ", department=" + department + "]";
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("abc", 23, "mech"));
		list.add(new Employee("bgc", 25, "It"));
		list.add(new Employee("efg", 29, "civil"));
		list.add(new Employee("mno", 21, "Entc"));

		Optional<Double> third = list.stream().map(Employee::getsalary).sorted(Comparator.reverseOrder()).skip(2)
				.findFirst();
		System.out.println("3rd age" + third);

		Map<String, List<Employee>> emp = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		// System.out.println("list of department "+emp);
		emp.forEach((a, b) -> System.out.println(a + " " + b));

		double sal = list.stream().sorted(Comparator.comparing(Employee::getsalary).reversed()).skip(2).findFirst().get()
				.getsalary();
		System.out.println(sal);
	}

}
