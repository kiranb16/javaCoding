package StringExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class IncreaseSalaryOfEmployee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(11, "aa", 32, 12000));
		list.add(new Employee(22, "bb", 22, 13000));
		list.add(new Employee(33, "cc", 24, 14000));
		list.add(new Employee(44, "dd", 33, 15000));
		list.add(new Employee(55, "ee", 30, 16000));

		List<Employee> salary = list.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.10);

			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(salary);

		String name = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get()
				.getName();
		System.out.println("highest salary person" + name);

		List<Employee> emplist = list.stream().filter(e -> e.getAge() > 25).collect(Collectors.toList());
		System.out.println("employee above 25 year" + emplist);

		List<Employee> sortedlist = list.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.limit(2)
				.collect(Collectors.toList());
		System.out.println("Top two highest salary"+sortedlist);
		
		
	}
}
