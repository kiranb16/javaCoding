package Java8Example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee2 {
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee2(String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department
				+ ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee2> list = new ArrayList<>();

		list.add(new Employee2("a", 21, "male", "mech", 2015, 123456.90));
		list.add(new Employee2("batwal", 23, "male", "it", 2016, 223456.90));
		list.add(new Employee2("c", 24, "female", "mech", 2012, 323456.90));
		list.add(new Employee2("d", 25, "female", "it", 2013, 234565.90));
		list.add(new Employee2("e", 26, "male", "mech", 2011, 234536.90));
		list.add(new Employee2("f", 27, "female", "it", 2015, 9234576.90));

		list.stream().map(Employee2::getDepartment).distinct().forEach(System.out::println);
		System.out.println("**************************************************");
		Map<String, Long> maleandFemale = list.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.counting()));
		System.out.println(maleandFemale);

		System.out.println("************************male and female average age*************************************");

		Map<String, Double> avgage = list.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.averagingDouble(Employee2::getAge)));
		System.out.println(avgage);
		System.out.println("**********************average salary************************");
		Double salary = list.stream().collect(Collectors.averagingDouble(Employee2::getSalary));
		System.out.println("average salary " + salary);

		System.out.println("=================================================================");
		list.stream().filter(e -> e.getYearOfJoining() > 2015).map(e -> e.getName()).forEach(System.out::println);

		System.out.println("-------------------------------------------------------------");
		Map<String, Map<String, List<Employee2>>> depname = list.stream()
				.collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.groupingBy(Employee2::getName)));
		System.out.println(depname);

		/*
		 * 
		 * 
		 * 
		 * System.out.
		 * println("**********************average salary************************");
		 * Double avgsal =
		 * list.stream().collect(Collectors.averagingDouble(Employee2::getSalary));
		 * System.out.println(avgsal); // employee before 2015 list.stream().filter(e ->
		 * e.getYearOfJoining() >
		 * 2015).map(Employee2::getName).forEach(System.out::println);
		 * 
		 * System.out.println("*******************departments****************");
		 * list.stream().map(Employee2::getDepartment).distinct().forEach(System.out::
		 * println);
		 * 
		 * System.out.println("departments& employee"); Map<String, Long> emplist =
		 * list.stream() .collect(Collectors.groupingBy(Employee2::getDepartment,
		 * Collectors.counting())); System.out.println(emplist);
		 * System.out.println("average age of male and female"); Map<String, Double>
		 * avgage=list.stream() .collect(Collectors.groupingBy(Employee2::getGender,
		 * Collectors.averagingDouble(Employee2::getAge))); System.out.println(avgage);
		 * 
		 * //sorting by salary System.out.println("sorting by salary");
		 * list.stream().sorted(Comparator.comparing(Employee2::getSalary)).forEach(
		 * System.out::println);
		 * 
		 */
	}
}
