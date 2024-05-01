package Java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee3 {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoinng;
	double salary;

	public Employee3(int id, String name, int age, String gender, String department, int yearOfJoinng, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoinng = yearOfJoinng;
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

	public int getYearOfJoinng() {
		return yearOfJoinng;
	}

	public void setYearOfJoinng(int yearOfJoinng) {
		this.yearOfJoinng = yearOfJoinng;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoinng=" + yearOfJoinng + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee3> list = new ArrayList<>();
		list.add(new Employee3(111, "kiran", 32, "male", "IT", 2012, 6700000.0));
		list.add(new Employee3(222, "ravi", 39, "male", "mech", 2008, 3700000.0));
		list.add(new Employee3(333, "ganpa", 35, "male", "IT", 2012, 7300000.0));
		list.add(new Employee3(444, "rehansh", 3, "male", "mech", 2009, 34700000.0));
		list.add(new Employee3(555, "savita", 30, "female", "IT", 2013, 7050000.0));
		list.add(new Employee3(666, "sujata", 28, "female", "civil", 2015, 7060000.0));
		list.add(new Employee3(777, "ashwini", 25, "female", "IT", 2019, 7000500.0));
		list.add(new Employee3(888, "varsha", 22, "female", "civil", 2017, 2700000.0));

		Map<String, Long> listgender = list.stream()
				.collect(Collectors.groupingBy(Employee3::getGender, Collectors.counting()));
		System.out.println("list of male and female" + listgender);
		
		System.out.println("departments");
		list.stream().map(Employee3::getDepartment).distinct().forEach(System.out::println);
	}

}
