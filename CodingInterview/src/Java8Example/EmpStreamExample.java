package Java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int age;
	private String gender;
	private String department;

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

	public Employee(String name, int age, String gender, String department) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class EmpStreamExample {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("abc", 22, "male", "mech"));
		list.add(new Employee("mno", 31, "male", "mech"));
		list.add(new Employee("cdo", 35, "female", "civil"));
		list.add(new Employee("pqr", 30, "female", "It"));
		list.add(new Employee("wxv", 32, "male", "mech"));

		// only departments using distinct and map ;
		System.out.println("only departments");
		list.stream().map(e -> e.getDepartment()).distinct().forEach(e -> System.out.println(e));
		// Employee with department and count
		System.out.println("***********************Emplloyee and count*********************************");

//		Map<String, Long> listempo = list.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//		for (Map.Entry<String, Long> m : listempo.entrySet()) {
//			System.out.println(m);
	    
			// average age of female and male
			System.out.println("average age of female and male");
			Map<String, Double>avage =list.stream().collect(Collectors.groupingBy(e->e.getGender(), 
					Collectors.averagingDouble(Employee::getAge)));
			System.out.println(avage);
			
			Map<String, Long> re=list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
			
			System.out.println(re);
		}

	}

